import java.util.*;
import java.lang.*;
import java.io.*;

class TurboSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);      // Read input
		int n = in.nextInt();     // Number count
		int[] input = new int[n];     // Array of numbers
		for (int i=0; i<n; i++){
		    input[i] = in.nextInt();      // Store the input values into the array
		}
		in.close();     // Close the Scanner

		Arrays.sort(input);     // Sort the array
		for (int j=0; j<input.length;j++)
		    System.out.println(input[j]);     // Print the array
	}
}
