import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Factorial
{
    public static BigInteger factorial(BigInteger t){
        if (t.compareTo(new BigInteger("1"))==0)            // Return 1 if t=1
            return new BigInteger("1");
        else
            return t.multiply(factorial(t.subtract(new BigInteger("1"))));          // Recursive calculate factorial
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);            // Read input
		int n = in.nextInt();           //  Number of test cases
		BigInteger t;
		for (int i=0; i<n; i++){
		    t =  new BigInteger(in.next());
		    System.out.println(factorial(t));
		}
	}
}
