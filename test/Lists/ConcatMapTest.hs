{-# LANGUAGE TemplateHaskell #-}
{-# LANGUAGE FlexibleInstances #-}
module Lists.ConcatMapTest where
import qualified Lists.ConcatMap as L
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)

instance Show (a -> [b]) where
    show f = show "f"

prop_concatMap ::(Eq b) => (a -> [b]) -> [a] -> Bool
prop_concatMap f xs  = Prelude.concatMap f xs == L.concatMap f xs

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure
