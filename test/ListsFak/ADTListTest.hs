{-# LANGUAGE TemplateHaskell #-}
module ListsFak.ADTListTest where
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)

prop_isEmpty_empty = null []  == True

prop_isEmpty_cons x xs = null (x:xs) == False

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure
