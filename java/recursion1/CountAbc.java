//    Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
//
//        countAbc("abc") → 1
//        countAbc("abcxxabc") → 2
//        countAbc("abaxxaba") → 2

    public int countAbc(String str) {

        int three = str.length() - 3;
        int two = str.length() - 2;
        int one = str.length() - 1;

        if (str.length() < 3) {
            return 0;
        }

        if (str.charAt(three) == 'a' && str.charAt(two) == 'b' && (str.charAt(one) == 'a' || str.charAt(one) == 'c')) {
            return countAbc(str.substring(0, one)) + 1;
        } else {
            return countAbc(str.substring(0, one)) + 0;
        }
    }
