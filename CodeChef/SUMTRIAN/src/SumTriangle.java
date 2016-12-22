import java.util.*;
import java.lang.*;
import java.io.*;

class SumTriangle
{
    public static void length(int[][] triangle){
        for (int i=triangle.length-1; i>=0; i--){
            for (int j=0; j<i; j++){
                triangle[i-1][j]+=Math.max(triangle[i][j],triangle[i][j+1]);
            }
        }
        System.out.println(triangle[0][0]);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();           // Number of test cases
		for (int i=0; i<n; i++){            // Iterate through the number of triangles
		    int size = in.nextInt();
		    int[][] triangle = new int[size][size];         // 2D-Array containing the triangle values
		    for (int j=0;j<size;j++){
		        for (int k=0;k<=j;k++){
		            triangle[j][k]= in.nextInt();           // Store the values within the array
		        }
		    }
		    length(triangle);
		}
	}
}
