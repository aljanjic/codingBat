//    Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
//
//    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
//    plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
//    plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]

public int[] plusTwo(int[] a, int[] b) {
        int[] sum = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++){
        sum[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
        sum[a.length + i] = b[i];
        }
        return sum;
}