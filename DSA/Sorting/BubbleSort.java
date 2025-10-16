package Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        // Declare and initialize an integer array to be sorted
        int[] arr = {6, 5, 1, 2, 3, 4};

        // Outer loop runs for each element in the array
        // After every pass, the largest element among the unsorted part
        // "bubbles up" to its correct position at the end
        for (int i = 0; i < arr.length; i++) {

            // Inner loop performs pairwise comparisons and swaps if needed
            // (arr.length - i - 1) ensures we skip the already sorted elements at the end
            for (int j = 0; j < arr.length - i - 1; j++) {

                // Compare adjacent elements
                // If the left element is greater than the right one, swap them
                if (arr[j] > arr[j + 1]) {

                    // Temporary variable used to swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array elements
        // This confirms that the array is now sorted in ascending order
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
