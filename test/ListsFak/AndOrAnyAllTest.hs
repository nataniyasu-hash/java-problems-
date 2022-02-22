{-# LANGUAGE TemplateHaskell #-}
{-# LANGUAGE FlexibleInstances #-}

module ListsFak.AndOrAnyAllTest where

import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)

instance Show (a -> Bool) where
    show f = show "f"

-- or ([]) 		= false
prop_or_empty = or []  == False

-- all(f,[])		= true
prop_all_empty f = all f [] == True

-- any(f,xs)		= or (map(f, xs))
prop_any_or f xs = any f xs == or (map f xs)

-- not(or(bs))  = and(map(not,bs))
prop_morgan bs = not (or bs) == and (map not bs)


return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure

