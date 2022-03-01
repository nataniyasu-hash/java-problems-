{-# LANGUAGE TemplateHaskell #-}
module ListsFak.MoreFunTest where
import qualified ListsFak.MoreFun as L
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)
import Data.List

-- | Testet die Funktion 'ohneDuplikate' gegen die Haskell Referenzimplementierung 'nub'
prop_nub :: Eq a => [a] -> Bool
prop_nub xs = L.nub xs == nub xs

-- | Haskell Intensivkurs S.241
prop_sorted :: (Eq a, Ord a) => [a] -> Bool
prop_sorted xs = let xs' = L.quicksort xs in and (zipWith (<=) xs' (tail xs'))

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure
