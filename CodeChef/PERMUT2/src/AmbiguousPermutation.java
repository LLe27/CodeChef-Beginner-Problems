import java.util.*;
import java.lang.*;
import java.io.*;

class AmbiguousPermutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){            // Iterate until there are no more values
		   int size = in.nextInt();         // Size of the permutation
		   if (size>0){
		       int[] array = new int[size];         // Array containing the original permutation
    		   for (int i=0; i<size; i++){
    		       array[i] = in.nextInt();         // Store the values of the permutation into the array
    		   }
		   
    		   int[] inverse = new int[size];           // Inverse permutation
    		   for (int j=0; j<size; j++){
    		       for (int k=0; k<size; k++){         // Search for the location of the value of j
    		           if (array[k] == (j+1)){          // Check if the value at array[k] is equal to j
    		               inverse[j] = (k+1);            // If so, store the value in inverse[j]
    		               break;
		                }
		            }
		        }
		        
		       if (Arrays.equals(array,inverse))
		        System.out.println("ambiguous");
    		   else
    		    System.out.println("not ambiguous");
		   }

		}
	}
}
