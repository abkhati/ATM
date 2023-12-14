package user;
import java.util.Scanner;
public class User 
{
	static String name = "Abc";
	static int age = 25;
	static char gender = 'm';
	static long adhno = 12345;
	static long accno = 4321;
	static String pan = "asd121s";
	static double bal =  10000;
	static int pswd = 1234;
	static Scanner sc = new Scanner(System.in);


	public static void withdraw() 
	{
		System.out.println("Enter Account Number: ");
		if (sc.nextLong()==accno)
		{
			System.out.println("Enter Password: ");
			if (sc.nextInt()==pswd)
			{
				System.out.println("Enter Amount: ");
				double balw= sc.nextDouble();
				if (balw<bal)
				{
					bal=bal-balw;
					System.out.println("Collect Cash");
				}
				else
				{
					System.out.println("InSufficient Balance");
				}
			}
			else
			{
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalid Account Number");
		}
	}

	public static void deposit() 
	{
		System.out.println("Enter Account Number: ");
		if (sc.nextLong()==accno)
		{
			System.out.println("Enter Password: ");
			if (sc.nextInt()==pswd)
			{
				System.out.println("Enter Amount: ");
				double balw= sc.nextDouble();
				bal=bal+balw;
				System.out.println("Cash Deposited");
			}
			else 
			{
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalid Account Number");
		}
	}

	public static void checkBalance() 
	{
		System.out.println("Enter Account Number");
		if (sc.nextLong()==accno)
		{
			System.out.println("Enter Password");
			if (sc.nextInt()==pswd)
			{
				System.out.println("Balance: "+bal);
			}
			else 
			{
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalid Account Number");
		}
	}

	public static void changePin()
	{
	    System.out.println("Enter Your Account Number:");
		if (sc.nextLong()==accno)
		{
			System.out.println("Enter Your Password");
            if (sc.nextInt()==pswd)
            {
				System.out.println("Enter New Password");
				int pswdcp = sc.nextInt();
				System.out.println("Re-Enter New Password");
                if (sc.nextInt()==pswdcp)
                {
					pswd = pswdcp; 
					System.out.println("Password Updated");
                }
            }
			else
			{
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalid Account Number");
		}



        /*String ans4 = ac4==acno ? pwd4==pwd ? "-- Change Password--" : "-- Invalid Password --" : "-- Invalid Account Number --" ;
		
		System.out.println(ans4);

		if (ac4==acno && pwd4==pwd)
		{
	        System.out.println(" Enter New Password");
		    int pwd41= sc.nextInt();
			System.out.println(" Re-Enter New Password");
            int  pwd42= sc.nextInt();

			if (pwd41==pwd42)
			{
				pwd=pwd42 ;
				System.out.println("===========================");
				System.out.println("-- Password Updated --");
				System.out.println("===========================");
			}
		}*/
	}
}
