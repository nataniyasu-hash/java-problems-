module Functions.Operators where
import Prelude hiding (max,not,odd)

add :: Int -> Int -> Int
add x y  = x + y

addRec :: Int -> Int -> Int
addRec x 0 = x
addRec x y = addRec (x+1) (y-1)

succ :: Int -> Int
succ x = x + 1


max :: Int -> Int -> Int
max a b = if a > b then a else b

not :: Bool -> Bool
not True = False
not False = True


und :: Bool -> Bool -> Bool
und a b = a && b

oder :: Bool -> Bool -> Bool
oder a b = a || b

nand :: Bool -> Bool -> Bool
nand a b = not (a && b)

nor :: Bool -> Bool -> Bool
nor a b = not (a || b)

odd :: Integer -> Bool
odd a = if a `mod` 2 /= 0 then True else False


