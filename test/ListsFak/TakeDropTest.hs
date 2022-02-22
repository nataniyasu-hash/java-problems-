{-# LANGUAGE TemplateHaskell #-}

module ListsFak.TakeDropTest where
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)



return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure
