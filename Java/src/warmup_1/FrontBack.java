//Given a string, return a new string where the first and last chars have been exchanged.
//
//        frontBack("code") → "eodc"
//        frontBack("a") → "a"
//        frontBack("ab") → "ba"

public String frontBack(String str) {
        if ((str.length() -1) < 1) {
        return str;
        }

        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);

        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        str = sb.toString();

        return last + str + first ;
        }
