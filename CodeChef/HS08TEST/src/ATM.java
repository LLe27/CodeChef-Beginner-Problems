import java.util.*;
import java.lang.*;
import java.io.*;

class ATM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);            // Read in input
		double withdrawal_amt = in.nextDouble();            // withdrawal amount
		double acc_balance = in.nextDouble();           // Bank account balance

		if (withdrawal_amt%5==0){           // Check if the withdrawal amount is multiples of 5
		    if (withdrawal_amt+0.50>acc_balance){           // Check if there is sufficient funds
		        System.out.println(acc_balance);
		    }
		    else{
		        acc_balance -= (withdrawal_amt+0.50);
		    System.out.println(acc_balance);
		    }
		}
		else
		    System.out.println(acc_balance);
	}
}
