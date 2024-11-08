// 5 Write a program to find the remainder when an integer A is divided by an integer B.

public class Remainder {

    public static void main(String[] args) {
        
        int[] A = {18, 35, 150}; 
        int[] B = {4, 9, 3};     

        if (A.length == B.length) {
            
            for (int i = 0; i < A.length; i++) {
                int remainder = A[i] % B[i];  
                System.out.println("The remainder when " + A[i] + " is divided by " + B[i] + " is: " + remainder);
            }
        } else {
            System.out.println("Arrays A and B must have the same length.");
        }
    }
}