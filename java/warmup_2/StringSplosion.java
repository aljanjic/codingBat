//    Given a non-empty string like "Code" return a string like "CCoCodCode".
//
//        stringSplosion("Code") → "CCoCodCode"
//        stringSplosion("abc") → "aababc"
//        stringSplosion("ab") → "aab"

    private String stringSplosion (String str){
        String result = "";
        String oldV = "";
        String newV = "";


        for (int i = 0; i < str.length(); i++){

            newV = oldV + str.charAt(i);
            result += newV;
            oldV = newV;

        }

        return result;
    }
