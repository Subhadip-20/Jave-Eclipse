package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_ARRAY {
	
	// Method to display the elements of an array
	public void DisplayArray(int arr[]) {
		System.out.print("The elements of the array are : [");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println(arr[arr.length-1]+"]");
	}
	
	// Method to take user input and create an array
	public int[] InputArray() throws IOException {
		int arr[], size;
		
		// Buffered Reader for taking input from the user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Prompt user to enter the size of the array
		System.out.print("Enter the size of the array : ");
		size = Integer.parseInt(br.readLine());
		arr = new int[size];
		
		// Loop to take user input for each element of the array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element number " + (i + 1) + " : ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// Return the created array
		return arr;
	}
}
