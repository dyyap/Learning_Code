package d141.users;

import java.util.Scanner;

public class FreeUser {

    private double balance = 0;
    // Protected to allow use in the PremiumUser class
    protected Scanner input;
    private String id;// Different name for convenience

    public FreeUser(final Scanner user, final String name) {
	input = user;
	id = name;
    }

    public final void addMoney(final double amount) {

	if (amount <= 0) {
	    System.err.println("Can not add negative or zero moneies.");
	    return;
	}
	balance += amount;
    }

    public final double getBalance() {
	return balance;
    }

    public final String getName() {
	return id;
    }

    /**
     *
     * @return Whether the user is premium
     */
    @SuppressWarnings("static-method")
    public boolean isPremium() {
	return false;
    }

    public final void subMoney(final double amount) {

	if (amount <= 0) {
	    System.err.println("Can not subtract negative or zero moneies.");
	    return;
	}
	balance -= amount;
    }

    @Override
    public String toString() {
	return "Name: " + id;
    }

}