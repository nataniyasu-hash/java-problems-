module Lists.MapFilter where
  
xs = map (\x->x^2)(filter (\x->mod x 2==0) [1..9])

sqrs  :: [Int]
sqrs = map(^2) (filter(/x -> x /= 0 && even x) [0..6])

euler1 :: Int
euler1 = sum (filter ( /x -> x 'mod' 3 == 0 || x 'mod' 5 == 0) [0..999])

finde :: (a -> Bool) -> [a] -> a
finde = head . filter
