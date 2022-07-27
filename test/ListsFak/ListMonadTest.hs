{-# LANGUAGE TemplateHaskell #-}
module ListsFak.ListMonadTest where
import ListsFak.ListMonad
import Test.QuickCheck
import Control.Applicative
import Control.Monad
import System.Exit(exitSuccess, exitFailure)

instance (Show a, Show b) => Show (a -> b) where
    show f = show "f"

prodsOddExp = do
  x <- [1..3]
  y <- [2..5]
  guard (odd (x+y))
  [x*y]

prop_prodsOdd = prodsOdd == prodsOddExp

cartProd1,cardProd2 :: [a] -> [b] -> [(a, b)]
cartProd1 xs ys = (,) <$> xs <*> ys
cardProd2 xs ys = liftA2 (,) xs ys

prop_cartProd1 xs ys = cartProd xs ys == cartProd1 xs ys
prop_cartProd2 xs ys = cartProd xs ys == cardProd2 xs ys

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure
