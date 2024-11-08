//1 Write a program to check whether X is present in array A
// Ex: array:[2,3,4,5,6]
// X:4
// Output: Yes

public class Array {

    public static void main(String[] args) {
        int[] numArr = {2, 8, 4, 5, 7};
        int x = 4;
        int i;

        for (i = 0; i < numArr.length; i++) {
            if (numArr[i] == x) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}