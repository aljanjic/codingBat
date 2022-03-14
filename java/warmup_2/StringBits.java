//    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
//
//        stringBits("Hello") → "Hlo"
//        stringBits("Hi") → "H"
//        stringBits("Heeololeo") → "Hello"

    public String stringBits(String str) {
        String result = "";
        int length = str.length();

        if (length > 0) {

            for (int i = 0; i < length; i = i + 2) {
                result = result + str.substring(i, i + 1);
            }
        }
        return result;
    }