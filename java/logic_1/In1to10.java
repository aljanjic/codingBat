//    Given a number n, return true if n is in the range 1..10, inclusive.
//    Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
//
//        in1To10(5, false) → true
//        in1To10(11, false) → false
//        in1To10(11, true) → true

public boolean in1To10(int num,boolean outsideMode){
        if(outsideMode){
            return num<=1 || num>=10;
        }

        return num>=1&&num<=10;


        }
