package Sorting;

public class InsertionSort {
    public static void main(String[] args) {

        // Declare and initialize an integer array to be sorted
        int[] arr = {6, 5, 1, 2, 3, 4};

        // Start from index 1 because the single element at index 0 is already "sorted"
        for (int i = 1; i < arr.length; i++) {

            // Set j to the previous index (used to compare backward)
            int j = i - 1;

            // Move backwards through the sorted portion of the array
            // Keep swapping as long as the current element is smaller than the previous element
            while ((j >= 0) && (arr[j] > arr[j + 1])) {

                // Swap arr[j] and arr[j+1] to place the smaller element before the larger one
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                // Move one step back for further comparison
                j--;
            }
        }

        // Print the sorted array elements
        // This confirms that the array is now sorted in ascending order
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
