import java.util.*;
import java.lang.*;
import java.io.*;

class Factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();           // Number of numbers to follow
		for (int i=0; i<T; i++){            // Iterate until there are no more values
		    int n = in.nextInt();           // Input value
		    int sum=0;          // Sum
		    while (n>0){            // Iterate until n<0
		        n/=5;
		        sum+=n;
		    }
		    System.out.println(sum);
		}
	}
}
