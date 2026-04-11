{-# LANGUAGE TemplateHaskell #-}
module Functions.DeMorganTest where
import Prelude hiding (not)
import Functions.Operators (nand, nor, not)
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)

prop_demorgan_nand :: Bool -> Bool -> Bool
prop_demorgan_nand a b = nand a b == (not a || not b)

prop_demorgan_nor :: Bool -> Bool -> Bool
prop_demorgan_nor a b = nor a b == (not a && not  b)


return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure

