{-# LANGUAGE TemplateHaskell #-}
{-# LANGUAGE FlexibleInstances #-}
module Lists.RecursionTest where
import qualified Lists.Recursion as L
import Prelude as P
import Data.List as PL
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

prop_last :: Eq a =>  [a] -> Property
prop_last xs = not (null xs) ==> L.last xs == P.last xs

prop_init :: Eq a =>  [a] -> Property
prop_init xs = not (null xs) ==> L.init xs == P.init xs

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

prop_maximum :: Ord a => [a]  -> Property
prop_maximum xs = not (null xs) ==> L.maximum xs == P.maximum xs

prop_minimum :: Ord a => [a]  -> Property
prop_minimum xs = not (null xs) ==> L.minimum xs == P.minimum xs

prop_append :: Eq a => [a] -> [a] -> Bool
prop_append xs ys = L.append xs ys == xs ++ ys

prop_concat :: Eq a => [[a]] -> Bool
prop_concat xss = L.concat xss == P.concat xss

prop_take :: Eq a =>  Int -> [a] -> Bool
prop_take  n xs = L.take n xs == P.take n xs

prop_drop :: Eq a =>  Int -> [a] -> Bool
prop_drop  n xs = L.drop n xs == P.drop n xs

-- | Testet die Funktion 'takeWhile' gegen die Haskell Referenzimplementierung 'takeWhile'.
-- Verwendet die zugehörigkeit zu einer zufälligen Liste als Prädikat.
prop_takeWhile :: Eq a => [a] -> [a] -> Bool
prop_takeWhile xs ys = (L.takeWhile (`P.elem` ys) xs) == (P.takeWhile (`P.elem` ys) xs)

prop_map ::  (Eq a, Eq b) => (a -> b) -> [a] -> Bool
prop_map f xs = L.map f xs == P.map f xs

prop_filter ::  Eq a => (a -> Bool) -> [a] -> Bool
prop_filter f xs = L.filter f xs == P.filter f xs

prop_reverse :: Eq a => [a] -> Bool
prop_reverse xs = L.reverse xs == P.reverse xs

prop_reverse_reverse :: Eq a => [a] -> Bool
prop_reverse_reverse xs = xs == L.reverse (L.reverse xs)

prop_partition ::  Eq a => (a -> Bool) -> [a] -> Bool
prop_partition f xs = L.partition f xs == PL.partition f xs

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure
