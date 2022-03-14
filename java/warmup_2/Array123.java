//Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
//
//        array123([1, 1, 2, 3, 1]) → true
//        array123([1, 1, 2, 4, 1]) → false
//        array123([1, 1, 2, 1, 2, 3]) → true

public boolean array123(int[] nums) {

        int[] array123 = { 1, 2, 3 };
        int a = 1;

        for (int i = 0; i <= nums.length - 3; i++) {

        int[] num = { nums[i], nums[i + 1], nums[i + 2] };

        if (Arrays.equals(array123, num)) {
        a = 0;
        }

        }

        return (a == 0);
        }