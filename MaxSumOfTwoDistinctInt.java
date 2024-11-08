// 3 You are given an array A of N integers, find the maximum sum of two distinct integers in the array.
// Note: It is guaranteed that there exist atleast two distinct integers in the array.

public class MaxSumOfTwoDistinctInt {

    public static void main(String[] args) {
        int[] A = {3, 5, 7, 2, 8, 8, 10}; 

        int max1 = A[0];
        int max2 = A[1];
        
        if (max2 > max1) {
            int temp = max1;
            max1 = max2;
            max2 = temp;
        }

    
        for (int i = 2; i < A.length; i++) {
            if (A[i] > max1) {
                max2 = max1; 
                max1 = A[i];  
            } else if (A[i] > max2 && A[i] != max1) {
                max2 = A[i]; 
            }
        }

        int maxSum = max1 + max2;
        System.out.println("The maximum sum of two distinct integers is: " + maxSum);
    }
}
