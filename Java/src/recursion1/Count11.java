//    Given a string, compute recursively (no loops) the number of "11" substrings in the string.
//    The "11" substrings should not overlap.
//
//        count11("11abc11") → 2
//        count11("abc11x11x11") → 3
//        count11("111") → 1

public int count11(String str) {


        if (str.indexOf("11") != -1) {
            return count11(str.substring(str.indexOf("11") + 2)) + 1;
        } else {
            return 0;
        }

    }
