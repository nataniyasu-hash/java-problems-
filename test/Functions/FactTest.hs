{-# LANGUAGE TemplateHaskell #-}
module Functions.FactTest where
import Functions.Functions
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)

xs = [(0,1),(1,1),(2,2),(3,6),(4,24),(5,120),(10,3628800)]                  
prop_fact_unclever = and [fact arg == result | (arg,result)<-xs]            
                                                                            
expected_facts = 1:(zipWith (*) expected_facts [1..])                       
actual_facts   = map fact [0..]                                             
prop_fact_clever = and $ take 7 $ zipWith (==) expected_facts actual_facts

return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure

