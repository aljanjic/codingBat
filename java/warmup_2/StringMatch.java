//Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
//
//        stringMatch("xxcaazz", "xxbaaz") → 3
//        stringMatch("abc", "abc") → 2
//        stringMatch("abc", "axc") → 0
//
    public int stringMatch(String stra, String strb) {
        int result = 0;

        int shortLength = Math.min(stra.length(), strb.length());

        for (int i = 0; i < shortLength - 1; i++) {
            if ((stra.charAt(i) == strb.charAt(i)) && (stra.charAt(i + 1)) == strb.charAt(i + 1)) {
                result++;
            }
        }
        return result;

    }
