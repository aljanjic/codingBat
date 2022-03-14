//Given a string, return a new string where the last 3 chars are now in upper case.
// If the string has less than 3 chars, uppercase whatever is there.
// Note that str.toUpperCase() returns the uppercase version of a string.
//
//        endUp("Hello") → "HeLLO"
//        endUp("hi there") → "hi thERE"
//        endUp("hi") → "HI"




public String endUp(String str) {

        String result = "";
        int length = str.length();

        if (length <= 3) {
        result = str.toUpperCase();
        } else {
        String first = str.substring(0, length - 3);
        String last = str.substring(length - 3);
        result = first + last.toUpperCase();
        }

        return result;
        }
