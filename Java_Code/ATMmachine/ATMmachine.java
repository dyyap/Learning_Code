package d141;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class ATMmachine {
	private float checkNumb;
	private static String WorD;
	private static double BankAccount;
	public double RandomNumberGenerator()
	{
		Random rand = new Random();
	checkNumb = rand.nextInt(39999999) + 1;
	  return checkNumb;
	}
	public static double Deposit() {
		Scanner lp = new Scanner(System.in);
		System.out.println("Would you like to deposit with cash or check");
		String ans = lp.next();
		System.out.println("How much would you like to put in?");
		double deposit = lp.nextInt();
		BankAccount = BankAccount + deposit;
		
		return BankAccount;
	}
	public static double Withdraw() {Scanner lp = new Scanner(System.in);
		System.out.println("Would you like to withdraw with cash or check");
		String ans = lp.next();
		System.out.println("How much would you like to take out?");
		double withdraw = lp.nextInt();
		BankAccount = BankAccount - withdraw;
		return BankAccount;
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello to the ATM\nwould you like to deposit or withdraw?");
	    WorD = sc.next();
	    if (WorD.equals("deposit")) {
	    	Deposit();
	    	Withdraw();
	    	
	    	
	    	
	    	
	    	
	    }
	    
		
	}}
