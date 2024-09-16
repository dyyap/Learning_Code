# ATM Machine

Methods:

<details><summary>Random Number Generator</summary>

    public double RandomNumberGenerator()
	{
		Random rand = new Random();
		checkNumb = rand.nextInt(39999999) + 1;
	  	
		return checkNumb;
	}

</details>

<details><summary>Deposit</summary>

    public static double Deposit() 
	{
		Scanner lp = new Scanner(System.in);
		System.out.println("Would you like to deposit with cash or check");
		String ans = lp.next();
		System.out.println("How much would you like to put in?");
		double deposit = lp.nextInt();
		BankAccount = BankAccount + deposit;
		
		return BankAccount;
	}
</details>

<details><summary>Withdraw</summary>

	public static double Withdraw() 
	{	
		Scanner lp = new Scanner(System.in);
		System.out.println("Would you like to withdraw with cash or check");
		String ans = lp.next();
		System.out.println("How much would you like to take out?");
		double withdraw = lp.nextInt();
		BankAccount = BankAccount - withdraw;
		
		return BankAccount;
		
	}
</details>

For Code Go: [here](../../../../../Java_Code/ATMmachine/ATMmachine.java)