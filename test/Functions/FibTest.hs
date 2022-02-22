{-# LANGUAGE TemplateHaskell #-}

module Functions.FibTest where
import Functions.Functions

import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)


prop_fib = False

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure

