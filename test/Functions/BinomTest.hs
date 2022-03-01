{-# LANGUAGE TemplateHaskell #-}
module Functions.BinomTest where
import Functions.Functions
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)

-- (n/0) = 1, fuer n>=0
prop_n_choose_0 n = n>=0 ==> binom n 0 == 1

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure
