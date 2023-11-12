package Searching;

import Sorting.BUBBLE_SORT;

public class BINARY_SEARCH {
	
	// Method to perform binary search on a sorted array
	int BinarySearch(int arr[], int x) {
		
		// Creating an instance of BUBBLE_SORT to perform sorting
		BUBBLE_SORT s = new BUBBLE_SORT();
		
		// Sorting the array using Bubble Sort (you may want to consider a separate sorting method)
		arr = s.BubbleSort(arr);
		
		// Initializing variables for binary search
		int low = 0, high = arr.length - 1, mid, pos = -1;
		
		// Binary search loop
		while (high >= low) {
			mid = (low + high) / 2;
			
			// If the element is found, update the position and break the loop
			if (arr[mid] == x) {
				pos = mid;
				break;
			} else if (x > arr[mid]) {
				// If the element is greater, search in the right half
				low = mid + 1;
			} else {
				// If the element is smaller, search in the left half
				high = mid - 1;
			}
		}
		
		// Return the position where the element is found (1-based index)
		return pos + 1;
	}
}
