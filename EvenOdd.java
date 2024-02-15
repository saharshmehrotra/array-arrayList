/*
Saharsh Mehrotra
22070126093
AIML B1
*/
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        // Get the number of elements from user input
        int n = Input.getNumberOfElements();
        // Declare arrays for even and odd numbers
        int[] even = new int[n];
        int[] odd = new int[n];

        int evenCount = 0; // Variable to track of the number of even elements
        int oddCount = 0;  // Variable to track of the number of odd elements

        // Get user input for array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int num = new Scanner(System.in).nextInt();
            if (num % 2 == 0) {
                even[evenCount] = num;
                evenCount++;
            } else {
                odd[oddCount] = num;
                oddCount++;
            }
        }
        // Display the even and odd arrays
        System.out.println("\nEven numbers:");
        displayArray(even, evenCount);
        System.out.println("\nOdd numbers:");
        displayArray(odd, oddCount);
    }
    // Method to display the elements of an array
    private static void displayArray(int[] arr, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}