//    Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
//
//        countX("xxhixx") → 4
//        countX("xhixhix") → 3
//        countX("hi") → 0


private int countX(String str) {
        if (str.length() == 0) return 0;

        if (str.charAt(str.length() - 1) != 'x') {
            return 0 + countX(str.substring(0, str.length() - 1));
        } else {
            return 1 + countX(str.substring(0, str.length() - 1));
        }

    }