import java.lang.*;
import java.util.Scanner;
class Atm
{
	public static void main (String [] args )
	{
		float Balance = 50000 , Deposite , Withdrawal ;
		Scanner sc= new Scanner (System.in);

		while (true)
		{
 			System.out.println ("");
			System.out.println ("");
			System.out.println ("|| welcome in  Atoumatic  Trailor Machine  || ");
			System.out.println (" which operation would you like to do.. ");
			System.out.println (" " );
			System.out.println ( " choose  '1'   for  withdrawal " );
			System.out.println ( " choose  '2'   for  Diposite " );
			System.out.println ( " choose  '3'   for  Check Balance " );
			System.out.println ( " choose  '4'   for  exit " );


			int choise ;
			choise = sc.nextInt ();
			switch (choise)
			{
				case  1 : System.out.print ("Enter Withdrawal amount :");  
				          Withdrawal = sc .nextInt ();
						  System.out.println ("");
						  System.out.println ("");
				          Balance = Balance - Withdrawal ;
				          System.out.println ("Please collect your cash ");
						  System.out.println("Now your total balance is  :" + Balance );
						  break;

				case  2 : System.out.print ("Enter deposite amount :");
           				  Deposite = sc.nextInt ();  
						  System.out.println ("");
						  System.out.println ("");
						  Balance += Deposite;
						  System.out.println("Now your total balance is  :" + Balance );
						  break;

				case  3 : System.out.println ("");
						  System.out.println ("");
						  System.out.println("Your total balance is  :" + Balance );

				case  4 : System.exit(0);
			}
		}
	}
}