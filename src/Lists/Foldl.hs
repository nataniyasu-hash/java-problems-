{-# LANGUAGE ExtendedDefaultRules #-}
module Lists.Foldl where
import Prelude hiding (sum,and,last,
                       prod,or,concat,
                       length,any,reverse,
                       elem,all)

sum :: Num a => [a] -> a
sum = foldl (+) 0

prod :: Num a => [a] -> a
prod = foldl (*) 1

and :: [Bool] -> Bool
and = foldl (&&) True

or :: [Bool] -> Bool
or = foldl (||) False

concat :: [[a]] -> [a]
concat = foldl (++) []

length :: [a] -> Int
length = foldl (\n x -> 1 + n) 0

any :: (a -> Bool) -> [a] -> Bool
any p = foldl (\z x -> p x || z) False


all :: (a -> Bool) -> [a] -> Bool
all p = foldl (\y x -> p x && y) True

elem :: Eq a => a -> [a] -> Bool
elem y = foldl (\z x -> z || x == y) False

reverse :: [a] -> [a]
reverse = foldl (\xs x -> x : xs) []

last :: [a] -> a
last (x:xs) = foldl (\ _ x -> x) x xs


allany :: (a -> Bool) -> [a] -> Bool
allany p xs = not (any (\x -> not (p x)) xs)


elemany :: Eq a => a -> [a] -> Bool
elemany y xs = any (\x -> x == y) xs


-- euler5 = undefined
