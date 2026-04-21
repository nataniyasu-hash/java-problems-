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




-- euler5 = undefined
