{-# LANGUAGE TemplateHaskell #-}
module Functions.GgtTest where
import Functions.Functions
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)

-- ggT(a, a) = a
prop_idempotence a = a>0 ==> ggT a a == a

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure

