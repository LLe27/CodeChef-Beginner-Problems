import java.util.*;
import java.lang.*;
import java.io.*;

class LUE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);			// Read in input
		while (in.hasNext()){			// Loop until there are no more values
		    int n = in.nextInt();
		    if (n==42)			// Check if the value is equal to 42
		        break;			// If so, then break
	        else
	            System.out.println(n);			// Else print the value
		}
	}
}
