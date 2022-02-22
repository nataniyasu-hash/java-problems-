{-# LANGUAGE TemplateHaskell #-}

module Functions.CollatzTest where
import Functions.Functions

import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)


prop_conjecture x = x>0&&x<100 ==>collatz x == 1


return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure

