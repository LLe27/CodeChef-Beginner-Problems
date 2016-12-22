import java.util.*;
import java.lang.*;
import java.io.*;

class EnormousIO
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);            // Read input
		int n = in.nextInt();           // Number of lines of input containing positive integers
		int k = in.nextInt();           // Value of k
		int count = 0;          // Amount of numbers divisible by 'k'
		for (int i=0; i<n; i++){
		    int t = in.nextInt();
		    if (t%k==0)         // Check if t is divisble by k
		        count++;            // If so then increment count
		}         // Iterate until there are no more values
		System.out.println(count);
	}
}
