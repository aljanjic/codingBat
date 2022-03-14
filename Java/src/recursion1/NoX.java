//    Given a string, compute recursively a new string where all the 'x' chars have been removed.
//
//        noX("xaxb") → "ab"
//        noX("abc") → "abc"
//        noX("xx") → ""

    public String noX(String str) {

        if (str.length() < 1) {
            return "";
        }

        if (str.charAt(str.length() - 1) == 'x') {
            return noX(str.substring(0, str.length() - 1));
        } else {
            return noX(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
        }
    }

