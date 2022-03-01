{-# LANGUAGE TemplateHaskell #-}
module Lists.ComprehensionTest where
import Lists.Comprehension
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)
import Control.Applicative
import Control.Monad

instance (Show a, Show b) => Show (a -> b) where
    show f = show "f"

sqrsExp = do
  x <- [0..6]
  guard (mod x 2==0 && x/=0)
  [x^2]

prodsOddExp = do
  x <- [1..3]
  y <- [2..5]
  guard (odd (x+y))
  [x*y]

prop_sqrs = sqrs == sqrsExp

prop_prodsOdd = prodsOdd == prodsOddExp

cartProd1,cardProd2 :: [a] -> [b] -> [(a, b)]
cartProd1 xs ys = ((,) <$> xs <*> ys)
cardProd2 xs ys = liftA2 (,) xs ys

prop_cartProd1 xs ys = cartProd xs ys == cartProd1 xs ys
prop_cartProd2 xs ys = cartProd xs ys == cardProd2 xs ys

prop_map f xs = Lists.Comprehension.map f xs == Prelude.map f xs

prop_filter f xs = Lists.Comprehension.filter f xs == Prelude.filter f xs

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure
