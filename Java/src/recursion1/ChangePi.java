//    Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
//
//        changePi("xpix") → "x3.14x"
//        changePi("pipi") → "3.143.14"
//        changePi("pip") → "3.14p"

    public String changePi(String str) {

        String result = "";

        if (str.length() == 0) {
            return result;
        }
        if (str.length() == 1) {
            result = String.valueOf(str.charAt(0));
            return result;
        }

        if (str.charAt(str.length() - 2) == 'p' && str.charAt(str.length() - 1) == 'i') {
            result = changePi(str.substring(0, str.length() - 2)) + "3.14";
        } else {
            result = changePi(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
        }

        return result;
    }


