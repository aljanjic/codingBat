//    Given a string, return a version where all the "x" have been removed.
//    Except an "x" at the very start or end should not be removed.
//
//        stringX("xxHxix") → "xHix"
//        stringX("abxxxcd") → "abcd"
//        stringX("xabxxxcdx") → "xabcdx"

private String stringX(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != 'x' || i == 0 || i == str.length() - 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    private static String lets(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (((0 < i) && (i < str.length() - 1)) && str.substring(i, i + 1).equals('x')) {

            }

        }

        return result;
    }
