module Lists.Recursion where
import Prelude hiding (sum,all,reverse,
                       prod,append,take,
                       length,concat,drop,
                       elem,map,takeWhile,
                       and,filter,dropWhile,
                       or,init,minimum,
                       any,last,maximum)
import Numeric.Natural

length :: [a] -> Int
length [] = 0
length (x:xs) = 1 + length xs

sum :: [Int] -> Int
sum [] = 0
sum (x:xs) = x + sum xs

prod :: [Int] -> Int
prod [] = 1
prod (x:xs) = x * prod xs


last :: [a] -> a
last [x] = x
last (_:xs) = last xs

init :: [a] -> [a]
init [_] = []
init (x:xs) = x : init xs

elem :: Eq a => a -> [a] -> Bool
elem _ [] = False
elem z (x:xs) = (z == x) || elem z xs

and :: [Bool] -> Bool
and [] = True
and (x:xs) = x && and xs

or :: [Bool] -> Bool
or [] = False
or (x:xs) = x || or xs

any :: (a -> Bool) -> [a] -> Bool
any _[] = False
any p (x:xs) = p x || any p xs

all :: (a -> Bool) -> [a] -> Bool
all _[] = True
all p (x:xs) = p x || all p xs

maximum :: Ord a => [a] -> a
maximum [x] = x
maximum (x:xs) = max x (maximum xs)

minimum :: Ord a => [a] -> a
minimum [x] = x
minimum (x:xs) = min x (minimum xs)

append :: [a] -> [a] -> [a]
append [] ys = ys
append (x:xs) ys = x : append xs ys

concat :: [[a]] -> [a]
concat [] = []
concat (xs:xss) = xs ++ concat xss

take :: Natural -> [a] -> [a]
take 0 [] = []
take _ [] = []
take n (x:xs) = x : take (n - 1) xs

drop :: Int -> [a] -> [a]
drop _ [] = []
drop 0 xs = xs
drop n (x:xs) = drop (n - 1) xs

takeWhile :: (a -> Bool) -> [a] -> [a]
takeWhile _[] = []
takeWhile p (x:xs)
    | p x = x : takeWhile p xs
    | otherwise = []

dropWhile :: (a -> Bool) -> [a] -> [a]
dropWhile _[] = []
dropWhile p (x:xs)
    | p x = x : dropWhile p xs
    | otherwise = x : xs
     
map :: (a -> b) -> [a] -> [b]
map f [] = []
map f (x:xs) = f x : map f xs

filter :: (a -> Bool) -> [a] -> [a]
filter p [] = []
filter p (x:xs)
    | p x = x : filter p xs
    | otherwise = filter p xs

reverse :: [a] -> [a]
reverse [] = []
reverse (x:xs) = reverse xs ++ [x]

partition :: (a -> Bool) -> [a] -> ([a], [a])
partition _ [] = ([], [])
partition p (x:xs)
    | p x = ((x:accepted), rejected)
    | otherwise = (accepted, (x:rejected))
        where (accepted, rejected) = partition p xs
