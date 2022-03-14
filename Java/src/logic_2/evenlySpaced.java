//    Given three ints, a b c, one of them is small, one is medium and one is large.
//    Return true if the three values are evenly spaced, so the difference between
//    small and medium is the same as the difference between medium and large.
//
//        evenlySpaced(2, 4, 6) → true
//        evenlySpaced(4, 6, 2) → true
//        evenlySpaced(4, 6, 3) → false

    public boolean evenlySpaced(int a, int b, int c) {


        int temp =0;
        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            temp = c;
            c = b;
            b = temp;
        }

        if (a > b) {
            temp = a;
            a = b;
            b =temp;
        }

        return b -a == c-b;



//        int small = a < b && a < c ? a : b < c && b < a ? b : c < b && c < a ? c : 0;
//
//        int medium = (a > b && a < c) || (a > c && a < b) ? a : (b > a && b < c) || (b > c && b < a) ? b : (c > b && c < a) || (c > a && c < b) ? c : 0;
//
//        int large = a > b && a > c ? a : b > c && b > a ? b : (c > b && c > a) ? c : 0;
//
//
//        if (Math.abs(large - medium) == Math.abs(medium - small)) return true;
//
//
//        return false;


//        int small = 0;
//        int medium = 0;
//        int large = 0;
//
//        if (a < b && a < c) small = a;
//        if (b < c && b < a) small = b;
//        if (c < b && c < a) small = c;
//
//        if ( (a > b && a < c) || (a > c && a < b) ) medium = a;
//        if ( (b > a && b < c) || (b > c && b < a) ) medium = b;
//        if ( (c > b && c < a) || (c > a && c < b) ) medium = c;
//
//
//        if (a > b && a > c) large = a;
//        if (b > c && b > a) large = b;
//        if (c > b && c > a) large = c;
//
//
//        if (Math.abs(large - medium) == Math.abs(medium -small)) return true;
//
//
//        return false;

    }

