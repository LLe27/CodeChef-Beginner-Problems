import java.util.*;
import java.lang.*;
import java.io.*;

class CielReceipt
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);           // Read input
		int n = in.nextInt();           // Number of test cases
		for (int i=0; i<n; i++){            // Iterate through the number of test cases
		    int p = in.nextInt();           // Total price, p
		    int menus = 0;          // Minimum number of menus
		    for (int j=12; j>0; j--){           // Iterate through the menu prices
		        int menu_price = (int)Math.pow(2,j-1);          // Item price
		        if (p>=menu_price){         // If the menu price is less that then total cost
		            menus = menus + p/menu_price;           // Menu is equal to menu plus the number of minimum number of purchases
		            p = p%menu_price;           // total price is equal to the total cost after purchasing minimum number of items
		        }
		    }
		    System.out.println(menus);
		}
		in.close();
	}
}
