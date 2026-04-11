{-# LANGUAGE TemplateHaskell #-}
module Functions.FibTest where
import Functions.Functions
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)


prop_fib_example :: Bool
prop_fib_example = fib 5 == 5

prop_data :: Property
prop_data =  forAll (elements [0 , 3, 1, 7]) $ \n ->
    if n > 1
    then  fib n == fib(n - 1) + fib(n - 2)
    else  fib n == n



return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure

