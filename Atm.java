import java.util.Scanner;
class Atm 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for (; ; )
		{
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Change Password");
			System.out.println("5. Exit");

			switch (sc.nextInt())
			{
			case 1 :
				{
					User.withdraw();
					break;
				}
			case 2 :
				{
					User.deposit();
					break;
				}
			case 3 :
				{
					User.checkBalance();
					break;
				}
			case 4 :
				{
					User.changePin();
					break;
				}
			case 5 :
				{
					System.exit(0);
				}
			}
		}
	}
}
