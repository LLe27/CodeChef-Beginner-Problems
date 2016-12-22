import java.util.*;
import java.lang.*;
import java.io.*;

class PackageCupcakes
{
    public static int package_size(int total){
        int size;
        if (total%2==0)
            size=(total/2)+1;
        else
            size=(total+1)/2;
            
        return size;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
	    int T = in.nextInt();           // Number of test cases
	    int[] cupcakes = new int[T];
	    for (int i=0; i<T; i++){
	        cupcakes[i] = in.nextInt();
	    }
	    for (int j=0;j<cupcakes.length;j++){
	        System.out.println(package_size(cupcakes[j]));
	    }
	    in.close();
	}
}
