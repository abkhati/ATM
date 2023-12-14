package user;
import java.util.Scanner;
public class UserC 
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
		System.out.println("Enter Your Account Number");
		int ac1 = sc.nextInt();
		System.out.println("Enter Your Password");
        int pwd1 =sc.nextInt();
		System.out.println("Enter Your Amount");
		double amt1 = sc.nextDouble();

		
		String ans= ac1==accno ? pwd1==pswd? amt1<=bal? "--Collect Cash--" : "--Insufficient Ballance--" : "--Invalid Password--" : "--Invalid Account Number--";
	    	System.out.println("===========================");
	    	System.out.println(ans);
	    	System.out.println("===========================");

		if (ac1==accno && pwd1==pswd && amt1<=bal)
		{
            bal-=amt1 ;
		    System.out.println("Select Your Option");

		    System.out.println("1. Viwe Balance");
	     	System.out.println("2. No");
                    
	    	System.out.println("Select Your Option");
	    	int choice1 = sc.nextInt();

	      	switch (choice1)
	    	{
	    	    case 1: 
				{
				    System.out.println("=========================");
					System.out.println("--Balance: "+bal+"--");
					System.out.println("=========================");
					break;
				}
		    	case 2:

				{
					break;
				}
					
		    }
		}

        
	}

	public static void deposit()
	{
        System.out.println("Enter Your Account Number");
		int ac2 = sc.nextInt();
		System.out.println("Enter Your Password");
        int pwd2 =sc.nextInt();
		System.out.println("Enter Your Amount");
		double amt2 = sc.nextDouble();

		String ans2 = ac2==accno ? pwd2==pswd ?  "-- Amount Deposited And Updated --" : "-- Invalid Password --" : "-- Invalid Account Number --" ;

		System.out.println("===========================");
		System.out.println(ans2) ;
		System.out.println("===========================");

		if ( ac2==accno && pwd2==pswd)
		{
			bal+=amt2 ;	
			System.out.println("1. Viwe Balance");
		    System.out.println("2. No");
                    
		    System.out.println("Select Your Option");
		    int choice2 = sc.nextInt();

		    switch (choice2)
		    {
		    case 1: 
			{
			    System.out.println("===========================");
				System.out.println("-- Balance: "+bal+" --");
				System.out.println("===========================");
				break;
			}
		    case 2:
	    	{
				break;
			}			
		    }
		}

			
	}
    
	public static void balance()
	{
		System.out.println("Enter Your Account Number");
		int ac3 = sc.nextInt();
		System.out.println("Enter Your Password");
        int pwd3 =sc.nextInt();
					
		String ans3 = ac3==accno ? pwd3==pswd ? "-- Balance: " : "-- Invalid Password --" : "-- Invalid Account Number --" ;

		System.out.println("===========================");
		System.out.println(ans3);
		if (ac3==accno && pwd3==pswd)
		{
			System.out.println(bal);
		}
		System.out.println("===========================");

	}

	public static void changePin()
	{
		System.out.println("Enter Your Account Number");
		int ac4 = sc.nextInt();
		System.out.println("Enter Your Password");
        int pwd4 =sc.nextInt();

    	String ans4 = ac4==accno ? pwd4==pswd ? "-- Change Password--" : "-- Invalid Password --" : "-- Invalid Account Number --" ;

		System.out.println(ans4);

		System.out.println("===========================");

		if (ac4==accno && pwd4==pswd)
		{
			System.out.println(" Enter New Password");
			int pwd41= sc.nextInt();
			System.out.println(" Re-Enter New Password");
			int  pwd42= sc.nextInt();

			if (pwd41==pwd42)
			{
				UserC.pswd=pwd42 ;
                System.out.println("===========================");
				System.out.println("-- Password Updated --");
				System.out.println("===========================");
			}
		}
	}
}
