package d141;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import d141.users.FreeUser;
import d141.users.PremiumUser;

public class GregsProgram {

    private static final Scanner input = new Scanner(System.in);
    /**
     * The list of all items available for purchase.
     */
    private static final List<ItemToSell> itemsOnSale = new ArrayList<>();

    // These are here b/c they are only used in this class
    private static final byte numFreeOptions = 4, numPremOptions = 6;
    private static String username;
    /**
     * Handles a sale to a user
     *
     * @param user
     *            The purchaser
     */
    private static void buyItem(final FreeUser user) {
	int largestOption = 0;

	System.out.printf("Account balance: %.2f\n", user.getBalance());
	System.out.println("Which item do you want to buy?");
	System.out.println("(0) Nothing");
	for (int i = 0; i < itemsOnSale.size(); i++) {
	    // Adds one to not overlap with the exit option
	    System.out.println("(" + (i + 1) + ") " + itemsOnSale.get(i).toString());
	    if (i > largestOption) {
		largestOption = i;
	    }
	}

	int option = input.nextInt();
	// Lock to get a valid option
	while ((option < 0) || (option > largestOption)) {
	    System.out.print("Invalid option. Please enter a number between 0 and " + largestOption + ": ");
	    option = input.nextInt();
	}

	if (option == 0) {
	    System.out.println("Maybe next time.");
	    return;
	}
	// Lists count from 0, option list counts from 1
	ItemToSell itemToBuy = itemsOnSale.get(option - 1);
	// Check for wallet
	if (itemToBuy.getPrice() > user.getBalance()) {
	    System.out.println("Sorry, we can not give credit. Please add more money to your account.");
	    return;
	}

	// Confirm purchase
	System.out.print("Press 'c' to confirm purchase: ");
	char confirmation = input.next().toLowerCase().charAt(0);
	if (confirmation != 'c') {
	    System.out.println("Confirmation not accepted. Returning to main menu...");
	    return;
	}

	// Initiate transfer
	user.subMoney(itemToBuy.getPrice());
	itemToBuy.getPoster().addMoney(itemToBuy.getPrice()); // Moves money from user (purchaser) to poster (seller)
	final boolean successfulTransfer = itemsOnSale.remove(itemToBuy);
	if (successfulTransfer) {
	    System.out.println("Congratulations! You are now the proud owner of a " + itemToBuy.getName() + " worth "
		    + String.format("%.2f", itemToBuy.getPrice()));
	}
    }

    /**
     *
     * @param user
     *            The user to check against
     * @return The max option number for the user
     */
    private static byte getMaxOption(final FreeUser user) {
	return user.isPremium() ? numPremOptions : numFreeOptions;
    }

    /**
     *
     * @param type
     * @return
     */
    private static final FreeUser getUserFromType(final char type, final String name) {
	if (type == 'f')
	    return new FreeUser(input, name);
	else if (type == 'p')
	    return new PremiumUser(input, name);
	System.err.println("Something is very wrong! getUserFromType recieved " + type + " for the type parameter.");
	return null;
    }

    @SuppressWarnings("null")
    public static void main(final String[] args) {
	System.out.println("Welcome to Greg's list. Are you a free or premium user?");

	String userType = input.next().toLowerCase();

	// Lock to get a correct user type (starts either with 'f' or 'p')
	while ((userType.startsWith("f") || userType.startsWith("p")) == false) {
	    System.out.print("Incorrect user type! Please type either (f)ree or (p)remium: ");
	    userType = input.next().toLowerCase();
	    System.out.println("\nType entered: " + userType);
	}
	
	
	HashMap<String, String> map = new HashMap<String, String>();	
	
	
	   Scanner sc = new Scanner(System.in);
	  map.put("username","username");
	  map.put("password","password");  
	  System.out.println(map);
	  
	  
	  System.out.println("Enter username");
	  username = sc.nextLine();

	  if(map.containsKey(username))
	  {
		  
		  System.out.println("Enter password");
		  String password = sc.nextLine();
	  
	    if(map.containsKey(password)) {
	     //can hold both types of user
	FreeUser user = getUserFromType(userType.charAt(0), username);

	// Checks if the getUserFromType method returned null. CRASH LOUDLY!
	if (user == null) {
	    System.err.println("User type was not set correctly! Exiting...");
	    System.exit(0);
	}

	// TODO: Remove this line? (was test)
	System.out.println("Premium User: " + user.isPremium());

	// User exits through pressing 0 on the main menu
	while (true) {
	    System.out.println("---------------------------------------------------------");
	    System.out.println("You have the following options: ");
	    printOptions(user);
	    System.out.print("Please enter a number (0 - " + getMaxOption(user) + "): ");
	    selectOption(user);
	}}}}
    /**
     * Prints to the console the options for a specific user
     *
     * @param user
     *            The user to print the option for.
     */
    private static void printOptions(final FreeUser user) {

	System.out.println("(0) Logoff");
	System.out.println("(1) Check account balance");
	System.out.println("(2) Add money to balance");
	System.out.println("(3) View currently listed items");
	System.out.println("(4) Buy an item");
	// End free user actions

	// Checks if the user is premium through two different methods
	if (user.isPremium() || (user instanceof PremiumUser)) {
	    System.out.println("(5) View your listed items");
	    System.out.println("(6) List an item for sale");
	    // TODO: Are these the only two additional actions for premium users?
	}
    }

    /**
     * Responds to the user input, one at a time
     *
     * @param user
     *            The user inputting the option
     */
    private static void selectOption(final FreeUser user) {
	byte option = input.nextByte();
	final byte maxOption = getMaxOption(user);

	while ((option < 0) || (option > maxOption)) {
	    System.out.print("Incorrect option. Please enter a number between 1 and " + maxOption + ": ");
	    option = input.nextByte();
	}

	// The option is premium. Setup a premium user object
	if (option > numFreeOptions) {
	    PremiumUser premUser = (PremiumUser) user;

	    switch (option) {
	    case 5:
		System.out.println("Your currently available items");
		for (ItemToSell item : itemsOnSale) {
		    // TODO: Should we implement the equals method?
		    if (item.getPoster().equals(premUser)) {
			System.out.println(item.toString());
		    }
		}
		break;
	    case 6:
		premUser.postItemForSale(itemsOnSale);
		break;
	    }
	    // Exit the method b/c we have already completed the action
	    return;

	}

	switch (option) {
	case 0:
	    System.out.println("Thank you for using Greg's List. Good bye.");
	    System.exit(0);
	    break;
	case 1:
	    System.out.printf("Account balance: %.2f\n", user.getBalance());
	    break;
	case 2:
	    System.out.print("How much would you like to add: ");
	    double amount = input.nextDouble();
	    while (amount <= 0) {
		System.out.print(
			"We can not add negative or zero dollars to an account. How much would you like to add: ");
	    }
	    user.addMoney(amount);
	    break;
	case 3:
	    System.out.println("Currently available items");
	    for (ItemToSell item : itemsOnSale) {
		System.out.println(item.toString());
	    }
	    break;
	case 4:
	    buyItem(user);
	    break;
	}
    }

}
