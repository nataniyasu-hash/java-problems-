module Lists.Comprehension where
import Prelude hiding (map,filter)

xs =  [x^2 | x <- [1..9], mod x 2==0 ]

sqrs :: [Int]
sqrs = [x^2 | x <- [0..6], x /= 0, even x]



euler1 :: Int
euler1 = sum [x | x <- [0..999], x `mod` 3 == 0 || x `mod` 5 == 0]

prodsOdd :: [Int]
prodsOdd = [x * y | x <- [1..3], y <- [2..5], (x + y) `mod`2 /= 0]

cartProd :: [a] -> [b] -> [(a, b)]
cartProd xs ys= [(x, y) | x <- xs , y <- ys]

map :: (a -> b) -> [a] -> [b]
map f xs = [f x | x <- xs]

filter :: (a -> Bool) -> [a] -> [a]
filter f xs = [x | x <- xs, f x]
