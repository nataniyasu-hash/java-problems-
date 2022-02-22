{-# LANGUAGE TemplateHaskell #-}

module Lists.MapFilterTest where
import Lists.MapFilter
import Test.QuickCheck
import Control.Monad
import System.Exit(exitSuccess, exitFailure)


sqrsExp = do
  x <- [0..6]
  guard (mod x 2==0 && x/=0)
  [x^2]

prop_sqrs = sqrs == sqrsExp

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure

