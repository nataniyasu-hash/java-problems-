{-# LANGUAGE TemplateHaskell #-}
module ListsFak.MinimumMaximumTest where
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)

-- prop_minimum_empty = minimum [] == error
-- dieses Axiom können Sie auslassen

-- any(x → x==minimum(xs),xs)   = true, falls xs nicht leer
prop_any_minimum :: Ord a => [a]  -> Property
prop_any_minimum xs = not (null xs) ==> any (\x->x==minimum xs) xs == True

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure
