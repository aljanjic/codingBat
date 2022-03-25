//    Given an array of ints, return true if the number of 1's is greater than the number of 4's
//
//    more14([1, 4, 1]) → true
//    more14([1, 4, 1, 4]) → false
//    more14([1, 1]) → true

public boolean more14(int[] nums){
        int numOne = 0;
        int numFour = 0;

        for (int i = 0; i < nums.length; i++){

        if (nums[i] == 1) numOne += 1;
        if (nums[i] == 4) numFour += 1;
        }

        return numOne > numFour;
        }