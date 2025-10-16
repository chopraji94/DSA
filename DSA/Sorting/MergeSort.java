package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    // -------------------------------
    // Function to merge two sorted halves of the array
    // -------------------------------
    public static void merge(int[] arr, int low, int mid, int high) {

        // Create a temporary list to store merged elements
        List<Integer> temp = new ArrayList<>();

        // Left half starts from 'low' to 'mid'
        int left = low;

        // Right half starts from 'mid + 1' to 'high'
        int right = mid + 1;

        // Compare elements from both halves and merge in sorted order
        while ((left <= mid) && (right <= high)) {
            if (arr[left] <= arr[right]) {
                // If left element is smaller, add it to temp and move left pointer
                temp.add(arr[left]);
                left++;
            } else {
                // If right element is smaller, add it to temp and move right pointer
                temp.add(arr[right]);
                right++;
            }
        }

        // Copy remaining elements from the left half (if any)
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Copy remaining elements from the right half (if any)
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy the merged elements back into the original array
        // 'i - low' ensures we correctly index the temp list
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    // -------------------------------
    // Recursive function to divide the array and sort each half
    // -------------------------------
    public static void mergeSort(int[] arr, int low, int high) {
        // Base condition: if there is only one element, it's already sorted
        if (low >= high) {
            return;
        }

        // Find the midpoint of the array
        int mid = (low + high) / 2;

        // Recursively sort the left half
        mergeSort(arr, low, mid);

        // Recursively sort the right half
        mergeSort(arr, mid + 1, high);

        // Merge the two sorted halves
        merge(arr, low, mid, high);
    }

    // -------------------------------
    // Main method to test the Merge Sort implementation
    // -------------------------------
    public static void main(String[] args) {

        // Declare and initialize an array to be sorted
        int[] arr = {6, 5, 1, 2, 3, 4};

        // Call the mergeSort function with the full array range
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array elements
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
