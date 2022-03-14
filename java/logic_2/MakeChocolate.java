

//    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
//    Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
//
//        makeChocolate(4, 1, 9) → 4
//        makeChocolate(4, 1, 10) → -1
//        makeChocolate(4, 1, 7) → 2


    public int makeChocolate(int small, int big, int goal) {


        int remainder = big * 5 <= goal ? goal - big * 5 : goal % 5;

        return remainder <=small ? remainder : -1;


//        if (goal <= big * 5 + small) {
//            if (goal % 5 <= small) {
//
//
////                small bricks have been used more than 5
//                if (goal / 5 > big) {
//                    return goal - big * 5;
//                }
//
//
////                small brick have been used less than 5
//                if (goal % 5 > 0 ) {
//                    return goal % 5;
//                }
//
//
//
//                //               0 small bricks are not used
//                if (goal / 5 <= big) {
//                    return 0;
//                }
//
//            }
//
//
//        }
//
//
//        return -1;

    }


