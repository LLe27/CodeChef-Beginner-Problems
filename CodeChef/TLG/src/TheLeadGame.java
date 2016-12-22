import java.util.*;
import java.lang.*;
import java.io.*;

class TheLeadGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();           // Number of rounds in the game
		int W=0;            // Winner default to 0
		int L=0;            // Point lead default to 0
		int p1=0;
		int p2=0;
		for (int i=0; i<N; i++){
		    p1+=in.nextInt();           // Player 1 points
		    p2+=in.nextInt();           // Player 2 points
		    if ((p1-p2)>0){         // Check if player 1 is in the lead
		        if ((p1-p2)>L){
		            W=1;
		            L=(p1-p2);
		        }
		    }
		    else{
		        if ((p2-p1)>L){         // Check if player 2 is in the lead
		            W=2;
		            L=(p2-p1);
		        }
		    }
		}
		in.close();
		System.out.println(W + " " + L);
	}
}
