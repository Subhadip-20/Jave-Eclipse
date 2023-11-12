package Searching;

public class LINEAR_SEARCH {

    // Method to perform linear search in an array
    int LinearSearch(int a[], int x)
    {   
        // Initialize position to -1 (not found)
        int pos = -1;
        
        // Iterate through the array to find the element
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                // If the element is found, update the position and break the loop
                pos = i + 1; // 1-based index
                break;
            }
        }
        
        // Return the position where the element is found (or -1 if not found)
        return pos;
    }
}
