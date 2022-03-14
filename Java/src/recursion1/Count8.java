//    Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
//    except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
//    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
//
//        count8(8) → 1
//        count8(818) → 2
//        count8(8818) → 4

    public int count8(int num) {

        if (num == 0) {
            return 0;
        }

        if (num % 100 == 88) {
            return count8(num / 10) + 2;
        } else if (num % 10 == 8) {
            return count8(num / 10) + 1;
        } else {
            return count8(num / 10) + 0;
        }

    }

