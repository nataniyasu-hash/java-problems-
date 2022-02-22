module Functions.Functions where

-- "Get Programming with Haskell" S. 80
collatz 1 = 1
collatz n = if even n
            then collatz (n `div` 2)
            else collatz (n*3 + 1)

ggT :: Int -> Int -> Int
ggT a b = undefined

fact = undefined

binom = undefined
