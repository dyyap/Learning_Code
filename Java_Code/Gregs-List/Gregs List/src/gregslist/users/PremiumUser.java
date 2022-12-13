package gregslist.users;

import java.util.List;
import java.util.Scanner;

import gregslist.ItemToSell;

public class PremiumUser extends FreeUser {

    public PremiumUser(final Scanner user, final String name) {
	super(user, name);
    }

    @Override
    public boolean isPremium() {
	return true;
    }

    /**
     * Adds an item to the list from user information.
     *
     * @param itemsOnSale
     *            The current list of items on sale
     */
    public void postItemForSale(final List<ItemToSell> itemsOnSale) {

	System.out.print("Type the name of the item you want to list: ");
	String name = input.next();

	System.out.print("\nPlese enter the price of the item: ");
	double price = input.nextDouble();

	// Lock to get a positive double for the price
	while (price <= 0) {
	    System.out.print("\nThe price can not be negative. Please enter a positive number for the price: ");
	    price = input.nextDouble();
	}

	itemsOnSale.add(new ItemToSell(name, price, this));
    }

}
