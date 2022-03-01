{-# LANGUAGE TemplateHaskell #-}
{-# LANGUAGE FlexibleInstances #-}
module Lists.FoldlTest where
import qualified Lists.Foldl as L
import Prelude as P
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)

instance (Show a, Show b) => Show (a -> b) where
    show f = show "f"

prop_length :: [a] -> Bool
prop_length xs = L.length xs == P.length xs

prop_sum :: [Int] -> Bool
prop_sum xs = L.sum xs == P.sum xs

prop_prod :: [Int] -> Bool
prop_prod xs = L.prod xs == P.product xs

prop_elem :: Eq a => a -> [a] -> Bool
prop_elem x xs = L.elem x xs == P.elem x xs

prop_and :: [Bool] -> Bool
prop_and xs = L.and xs == P.and xs

prop_or :: [Bool] -> Bool
prop_or xs = L.or xs == P.or xs

prop_any :: (a -> Bool) -> [a] -> Bool
prop_any p xs = L.any p xs == P.any p xs

prop_all :: (a -> Bool) -> [a] -> Bool
prop_all p xs = L.all p xs == P.all p xs

prop_concat :: Eq a => [[a]] -> Bool
prop_concat xss = L.concat xss == P.concat xss

prop_reverse :: Eq a => [a] -> Bool
prop_reverse xs = L.reverse xs == P.reverse xs

prop_reverse_reverse :: Eq a => [a] -> Bool
prop_reverse_reverse xs = xs == L.reverse (L.reverse xs)

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure
