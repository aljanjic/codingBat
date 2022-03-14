//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
//
//        loneTeen(13, 99) → true
//        loneTeen(21, 19) → true
//        loneTeen(13, 13) → false

public boolean loneTeen(int a, int b) {

        boolean aTeen = (a > 12 && a < 20);
        boolean bTeen = (b > 12 && b < 20);

        return (aTeen && !bTeen || !aTeen && bTeen);

        }
