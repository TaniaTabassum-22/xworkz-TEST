// 7 You are given an integer N. Write a program to calculate the sum of all the digits of N.

public class SumOfDigits {

    public static void main(String[] args) {
        int N = 221812; 

        String numberStr = Integer.toString(N);

        int[] digits = new int[numberStr.length()];

        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = numberStr.charAt(i) - '0';
            
        }

        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        System.out.println("The sum of the digits of " + N + " is: " + sum);
    }
}