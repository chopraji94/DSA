package Sorting;

public class SelectionSort {
    public static void main(String[] args) {

        // Declare and initialize an integer array to be sorted
        int[] arr = {6, 5, 1, 2, 3, 4};

        // Outer loop runs through each element in the array
        // The element at index 'i' will be placed in its correct (sorted) position
        for (int i = 0; i < arr.length; i++) {

            // Assume the smallest element is at index 'i'
            int smallestIndex = i;

            // Inner loop: find the actual smallest element in the unsorted portion
            for (int j = i + 1; j < arr.length; j++) {
                // Compare and update the index of the smallest element
                if (arr[smallestIndex] > arr[j]) {
                    smallestIndex = j;
                }
            }

            // Swap the smallest element found with the element at index 'i'
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }

        // Print the sorted array elements
        // Confirms that the array is now sorted in ascending order
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
