package Sorting;

public class SELECTION_SORT {
	
	// Method to perform Selection Sort on an array
	public int[] SelectionSort(int arr[]) {
		
		int min;
		
		// Outer loop for the number of passes
		for (int i = 0; i < arr.length - 1; i++) {
			
			// Assume the current index as the minimum
			min = i;
			
			// Inner loop to find the minimum element in the unsorted part
			for (int j = i + 1; j < arr.length; j++) {
				// Compare elements and update the minimum index
				if (arr[min] > arr[j])
					min = j;
			}
			
			// Swap the found minimum element with the first element of the unsorted part
			arr[i] = arr[i] + arr[min];
			arr[min] = arr[i] - arr[min];
			arr[i] = arr[i] - arr[min];
		}
		
		// Return the sorted array
		return arr;
	}
}
