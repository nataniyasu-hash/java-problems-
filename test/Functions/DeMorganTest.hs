{-# LANGUAGE TemplateHaskell #-}

module Functions.DeMorganTest where
import Functions.Operators

import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)


prop_demorgan = False

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure

