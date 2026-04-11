{-# LANGUAGE TemplateHaskell #-}
module Functions.GgtTest where
import Functions.Functions
import Test.QuickCheck
import System.Exit(exitSuccess, exitFailure)

-- ggT(a, a) = a
prop_idempotence a = a>0 ==> ggT a a == a

-- ggT (5, 0) = 5
prop_example_ggT :: Bool
prop_example_ggT = ggT 5 0 == 5

-- ggT neutrales Element
prop_neutral :: Positive Int -> Bool
prop_neutral (Positive a) = ggT a 0 == a

-- absorbierendes Element
prop_abso :: Positive Int -> Bool
prop_abso (Positive a) = ggT a 1 == 1

-- Kommutative Gesetzt
prop_comm :: Positive Int -> Positive Int -> Bool
prop_comm (Positive a) (Positive b) = ggT a b == ggT b a

--Assoziative
prop_asso :: Positive Int -> Positive Int -> Positive Int -> Bool
prop_asso (Positive a) (Positive b) (Positive c) = ggT a (ggT b c) == ggT c (ggT a b)

-- Distrubutive
prop_dis :: Property
prop_dis =  forAll (choose (0, 46340)) $ \a ->
            forAll (choose (0, 46340)) $ \b ->
            forAll (choose (0, 46340)) $ \m ->
            ggT (m * a) (m * b) == m * ggT a b

-- differenz eigenschaft
prop_dif :: Positive Int -> Positive Int -> Bool
prop_dif (Positive a) (Positive b)
    | a > b  = ggT a b == ggT (a - b) b
    | a < b = ggT a b == ggT (b - a)  a
    | otherwise  = True


return []
runTests = $quickCheckAll

main = runTests >>= \passed -> if passed then exitSuccess
                                         else exitFailure

