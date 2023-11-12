package Sorting;

import java.io.IOException;

import InputOutput.IO_ARRAY;

public class SORT {
    public static void main(String[] args) throws IOException {
        
        int arr[];

        // Creating instances of IO_ARRAY and BUBBLE_SORT
        IO_ARRAY ia = new IO_ARRAY();
//        BUBBLE_SORT bs = new BUBBLE_SORT();
        SELECTION_SORT ss = new SELECTION_SORT();

        // Take input for the array
        arr = ia.InputArray();

        // Display the original array
        System.out.println("Original Array:");
        ia.DisplayArray(arr);

        // Perform Bubble Sort on the array
        //arr = bs.BubbleSort(arr);
        arr=ss.SelectionSort(arr);
        // Display the sorted array
        System.out.println("Sorted Array:");
        ia.DisplayArray(arr);
    }
}
