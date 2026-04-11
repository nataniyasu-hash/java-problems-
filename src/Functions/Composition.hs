module Functions.Composition where
import Functions.Operators
import Functions.Functions
import Prelude hiding (even, odd, not)


even :: Integer -> Bool
even a = not (odd a)

evenFib :: Integer -> Bool
evenFib a = even (fib a)


