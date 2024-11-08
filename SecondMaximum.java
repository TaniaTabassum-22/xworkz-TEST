// 9 Write a program, that accepts sets of three numbers and prints the second maximum among the three

public class SecondMaximum {

    public static void main(String[] args) {
        int[] numbers = {5, 8, 3}; 

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        int secondMax = numbers[numbers.length - 2];

        System.out.println("The second maximum number is: " + secondMax);
    }
}