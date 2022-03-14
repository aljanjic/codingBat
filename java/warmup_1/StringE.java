//Return true if the given string contains between 1 and 3 'e' chars.
//
//        stringE("Hello") → true
//        stringE("Heelle") → true
//        stringE("Heelele") → false


public boolean stringE(String str) {

        int stringOccurance = str.split("e", -1).length - 1;
        return (stringOccurance >= 1 && stringOccurance <=3);

        }
