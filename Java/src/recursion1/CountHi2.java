//    Given a string, compute recursively the number of times lowercase "hi" appears in the string,
//    however do not count "hi" that have an 'x' immedately before them.
//
//        countHi2("ahixhi") → 1
//        countHi2("ahibhi") → 2
//        countHi2("xhixhi") → 0

    public int countHi2(String str) {

        int three = str.length() - 3;
        int two = str.length() - 2;
        int one = str.length() - 1;

        if (str.length() < 2) {
            return 0;
        }

        if (str.length() < 3 && str.charAt(two) == 'h' && str.charAt(one) == 'i') {
            return 1;
        }

        if (str.length() < 3 && (str.charAt(two) != 'h' || str.charAt(one) != 'i')) {
            return 0;
        }

        if (str.charAt(three) != 'x' && str.charAt(two) == 'h' && str.charAt(one) == 'i') {
            return countHi2(str.substring(0, one)) + 1;
        } else {
            return countHi2(str.substring(0, one)) + 0;
        }


    }