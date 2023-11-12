package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import InputOutput.IO_ARRAY;

public class SEARCH {

    public static void main(String[] args) throws IOException {

        int arr[], search;

        // Buffered Reader for taking input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Creating instances of IO_ARRAY and BINNARY_SEARCH
        IO_ARRAY ia = new IO_ARRAY();
//      LINEAR_SEARCH ls=new LINEAR_SEARCH(); // Commented out as not used in the current implementation
        BINARY_SEARCH bs = new BINARY_SEARCH();

        // Take input for the array
        arr = ia.InputArray();

        // Prompt user to enter the element to be searched
        System.out.print("Enter the element to be searched : ");
        search = Integer.parseInt(br.readLine());

//      int pos= ls.LinearSearch(arr, search); // Commented out as not used in the current implementation
        int pos = bs.BinarySearch(arr, search);

        // Display the result of the search
        System.out.println(pos);
        if (pos != -1)
            System.out.println("Number found at position : " + pos);
        else
            System.out.println("Number not found");
    }
}
