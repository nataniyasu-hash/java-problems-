{-# LANGUAGE TemplateHaskell #-}
module Functions.FunctionsTest where
import Functions.Functions
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)

prop_conjecture x = x>0&&x<100 ==>collatz x == 1

-- | Testet die Funktion ggT gegen die Haskell Referenzimplementierung gcd.
prop_ggT x y = x>0&&y>0 ==> ggT x y == gcd x y

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure

