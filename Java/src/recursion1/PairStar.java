//    Given a string, compute recursively a new string where
//    identical chars that are adjacent in the original string
//    are separated from each other by a "*".
//
//        pairStar("hello") → "hel*lo"
//        pairStar("xxyy") → "x*xy*y"
//        pairStar("aaaa") → "a*a*a*a"

    private String pairStar(String str) {
        String result = "";

        if (str.length() == 0) {
            return result;
        }
        if (str.length() == 1) {
            return str.charAt(0) + result;
        }

        if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2)) {
            return pairStar(str.substring(0, str.length() - 1)) + "*" + str.charAt(str.length() - 1);
        } else {
            return pairStar(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
        }
    }