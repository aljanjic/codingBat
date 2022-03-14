//  Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
//
//        blackjack(19, 21) → 21
//        blackjack(21, 19) → 21
//        blackjack(19, 22) → 19

public int blackjack(int a,int b){

        if(a>21)a=0;
        if(b>21)b=0;

        return isCloser(a,b);

        }

public int isCloser(int a,int b){

        return Math.abs(a-21)<Math.abs(b-21)?a:b;

        }


