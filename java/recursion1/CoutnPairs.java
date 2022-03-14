//We'll say that a "pair" in a string is two instances of a char separated by a char.
// So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x.
// Recursively compute the number of pairs in the given string.
//
//        countPairs("axa") → 1
//        countPairs("axax") → 2
//        countPairs("axbx") → 1


    public int countPairs(String str) {
        if (str.length() == 0){
            return 0;
        }

        if ( str.length() >= 3 && str.charAt(str.length()-1) == str.charAt(str.length() - 3 )) {
            return countPairs(str.substring(0, str.length() -1)) + 1;
        }

        return countPairs(str.substring(0, str.length() -1)) + 0;

    }
