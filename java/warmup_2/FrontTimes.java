//    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
//    or whatever is there if the string is less than length 3. Return n copies of the front;
//
//        frontTimes("Chocolate", 2) → "ChoCho"
//        frontTimes("Chocolate", 3) → "ChoChoCho"
//        frontTimes("Abc", 3) → "AbcAbcAbc"

    private String frontTimes(String str, int n) {

        String result = "";
        int frontLen = 3;

        if (frontLen > str.length()) {
            frontLen = str.length();
        }

        String front = str.substring(0, frontLen);

        for (int i = 0; i < n; i++) {
            result = result + front;
        }
        return result;

    }