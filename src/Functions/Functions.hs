module Functions.Functions where

-- "Get Programming with Haskell" S. 80
collatz 1 = 1
collatz n = if even n
            then collatz (n `div` 2)
            else collatz (n*3 + 1)

ggT :: Int -> Int -> Int
ggT a 0 = a
ggT a b = ggT b (a `mod` b)

fact :: Integer -> Integer
fact 0 = 1
fact n = n * fact (n - 1)

binom :: Integer -> Integer -> Integer
binom n k
    | k == 0 || n == k = 1
    | k > n || k < 0 = 0
    | otherwise  = binom (n - 1) (k - 1) + binom (n - 1) k


fib :: Integer -> Integer
fib 0 = 0
fib 1 = 1
fib n = fib (n - 1) + fib (n - 2)


