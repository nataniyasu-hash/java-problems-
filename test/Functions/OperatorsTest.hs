{-# LANGUAGE TemplateHaskell #-}
module Functions.OperatorsTest where
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)
import Functions.Operators as L

prop_commutative x y = add x y == add y x

prop_commutativeRec x y = x>0&&y>0 ==> addRec x y == addRec y x

prop_max x y = L.max x y == Prelude.max x y

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure
