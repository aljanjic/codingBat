//    Given a string, return a string where for every char in the original, there are two chars.
//
//        doubleChar("The") → "TThhee"
//        doubleChar("AAbb") → "AAAAbbbb"
//        doubleChar("Hi-There") → "HHii--TThheerree"

    public String doubleChar(String str) {

        char[] arr = new char[str.length() * 2];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            arr[count] = str.charAt(i);
            count++;
            arr[count] = str.charAt(i);
            count++;

        }

        return new String(arr);

//        String result = "";
//        for (int i = 0; i < str.length(); i ++){
//            result = result + str.charAt(i) + str.charAt(i);
//        }
//
//        return result;
    }





