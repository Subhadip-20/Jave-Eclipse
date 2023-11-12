package Sorting;

public class BUBBLE_SORT {

    // Method to perform Bubble Sort on an array
    public int[] BubbleSort(int arr[]) {
        // Outer loop for the number of passes
        for (int i = 0; i < arr.length; i++) {
            // Inner loop for each pass
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Compare adjacent elements and swap if necessary
                if (arr[j + 1] < arr[j]) {
                    // Swap elements without using a temporary variable
                    arr[j + 1] = arr[j + 1] + arr[j];
                    arr[j] = arr[j + 1] - arr[j];
                    arr[j + 1] = arr[j + 1] - arr[j];
                }
            }
        }
        // Return the sorted array
        return arr;
    }
}
