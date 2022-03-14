//Given a string, return true if the string starts with "hi" and false otherwise.
//
//        startHi("hi there") → true
//        startHi("hi") → true
//        startHi("hello hi") → false

public boolean startHi(String str) {
        if ( str.indexOf("hi") == 0 ) {
        return true;
        }else {
        return false;
        }

        }
