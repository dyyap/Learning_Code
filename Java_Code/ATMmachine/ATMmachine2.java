package d141;

// Authors David , Luke, and Daniel
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ATMmachine {
	private static int checkNumb;
	private static int BankAccount;
	private static int y;
	private static int x;
	private static Scanner scan;
	
	//produces check#
	public static int generateNumber()
	{
		Random rand = new Random();
		checkNumb = rand.nextInt(39999999) + 1000000;
		return checkNumb;
	}
	
	
	
	//Deposits
	public static double Deposit(ArrayList<String> Transactions) {
		int deposit = 0;
		String Deposit2;
		scan = new Scanner(System.in);
		System.out.println("Would you like to deposit with cash (1) or check (2)?");
		int ans = scan.nextInt();
		if(ans == 2){
			int checkNumber = generateNumber();// implements check#
			System.out.println("Enter the amount on the check: ");
			deposit = scan.nextInt();
			
			//receipt
			System.out.println("Account Number 00000000000000000");
			System.out.println("---------------------------------");
			System.out.println("Check Number: " + checkNumber + "\nAmount Deposited: $" + deposit);
			Deposit2 = "$" + deposit;
		
		}else{
			System.out.println("Enter the amount to deposit: ");
			deposit = scan.nextInt();
			
			//receipt
			System.out.println("Account Number 00000000000000000");
			System.out.println("---------------------------------");
			System.out.println("Cash Deposited: $" + deposit);
			Deposit2 = "$" + deposit;
			
		}
		BankAccount = BankAccount + deposit;
		System.out.println("Total Account: $" + BankAccount);
		Transactions.add(y++, Deposit2); //adds to end table
	
		return BankAccount;
	}
	
	
	public static double Withdraw(ArrayList<String> Transactions){
		int withdrawal = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw: ");
		withdrawal = scan.nextInt();
		BankAccount = BankAccount - withdrawal;
		String negWithdrawal = "-$" + withdrawal;
		
		Transactions.add(x++ ,negWithdrawal);// adds to end table
		
		// receipt
		System.out.println("Account Number 00000000000000000");
		System.out.println("---------------------------------");
		System.out.println("The amount withdrawn is " + withdrawal);
		System.out.println("Total Balance: $" + BankAccount);
		return BankAccount;
	}
	
	

	public static void main(String[] args) {
		
		int run = 1;
		ArrayList<String> Withdrawal = new ArrayList<String>();
		ArrayList<String> Deposits = new ArrayList<String>();
 		do{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Hello, welcome to the ATM.\nWould you like to deposit or withdraw? Enter 1 to deposit, enter 2 to withdraw.");
			int ans = sc.nextInt();
			if(ans == 1){
				Deposit(Deposits);
			}
			else{
				Withdraw(Withdrawal);
			}
			System.out.println("Would you like to make another transaction? Enter 1 for yes, 2 for no.");
			run = sc.nextInt();
		}while(run==1);
 		
 		//end table
 		System.out.println("End of the Day Transactions List");
 		System.out.println("----------------------------------");
		System.out.println("These are the Deposit Transactions");
		System.out.println(Deposits);
		System.out.println("These are the Withdrawal Transactions");
		System.out.println(Withdrawal);
		
		
	
	}
}
