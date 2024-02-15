import java.util.*;
public class SmallestDistance {
    public static void main(String args[]) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Prompt user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        // Check if the array has at least two elements
        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }
        // Declare an array to store user input elements
        int[] array = new int[n];
        // Prompt user to enter elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        // Initialize variables to find the pair with the smallest distance
        int minDistance = Integer.MAX_VALUE;
        int result = -1;
        // Iterate through the array to find neighboring numbers with the smallest distance
        for (int i = 0; i < n - 1; i++) {
            // Calculate the distance between current and next element
            int currentDistance = Math.abs(array[i] - array[i + 1]);
            // Check if the current distance is smaller than the minimum distance
            if (currentDistance < minDistance) {
                // Update the minimum distance and store the index of the first number in the pair
                minDistance = currentDistance;
                result = i;
            }
        }

        // Display the index of the first number in the pair with the smallest distance
        System.out.println("Index of the first number in the pair with the smallest distance: " + result);
        sc.close();
    }
}