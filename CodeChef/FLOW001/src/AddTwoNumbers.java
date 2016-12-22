import java.util.*;
import java.lang.*;
import java.io.*;

class AddTwoNumbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();           // Number of test cases
		for (int i=0; i<n; i++){
		    int a = in.nextInt();
		    int b = in.nextInt();
		    System.out.println(a+b);
		}
	}
}
