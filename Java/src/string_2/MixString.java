//    Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
//    the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
//
//        mixString("abc", "xyz") → "axbycz"
//        mixString("Hi", "There") → "HTihere"
//        mixString("xxxx", "There") → "xTxhxexre"

    public String mixString(String a, String b) {


        String result = "";

        if (a.length() >= b.length()) {

            int blength = b.length() - 1;
            for (int i = 0; i < a.length(); i++) {

                result += a.charAt(i);

                if (blength >= 0) {
                    result += b.charAt(i);
                    blength--;
                }
            }
        }



        if (a.length() < b.length()) {

            int alength = a.length() - 1;
            for (int i = 0; i < b.length(); i++) {

                if (alength >= 0) {
                    result += a.charAt(i);
                    alength--;
                }

                result += b.charAt(i);


            }
        }



        return result;
    }

