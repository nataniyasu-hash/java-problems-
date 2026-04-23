{-# LANGUAGE ExtendedDefaultRules #-}
module Lists.Foldr where
import Prelude hiding (sum,or,filter,
                       prod,any,reverse,
                       length,all,takeWhile,
                       elem,concat,minimum,
                       and,map,maximum)




sum :: Num a => [a] -> a
sum = foldr (+) 0

prod :: Num a => [a] -> a
prod = foldr (*) 1

length :: [a] -> Int
length = foldr (\x n -> 1 + n) 0

elem :: Eq a => a -> [a] -> Bool
elem y = foldr (\x z -> x == y || z) False

and :: [Bool] -> Bool
and = foldr (&&) True

or :: [Bool] -> Bool
or = foldr (||) False

any :: (a -> Bool) -> [a] -> Bool
any p = foldr (\x z -> p x || z) False

all :: (a -> Bool) -> [a] -> Bool
all p = foldr (\x y -> p x && y) True


concat :: [[a]] -> [a]
concat = foldr (++) []

reverse :: [a] -> [a]
reverse = foldr (\x xs -> xs ++ [x]) []

append :: [a] -> [a] -> [a]
append xs ys = foldr (:) ys xs

map :: (a -> b) -> [a] -> [b]
map f = foldr (\x ys -> f x : ys) []

filter :: (a -> Bool) -> [a] -> [a]
filter f = foldr (\x xs -> if f x then x : xs else xs) []


takeWhile :: (a -> Bool) -> [a] -> [a]
takeWhile p = foldr (\x xs -> if p x then x:xs else []) []     -- problematik xs mit acc vertauscht

minimum :: Ord a => [a] -> a
minimum (x : xs) = foldr min x xs

maximum :: Ord a => [a] -> a
maximum (x : xs) = foldr max x xs










