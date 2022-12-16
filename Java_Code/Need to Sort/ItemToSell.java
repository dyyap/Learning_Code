package d141;

import d141.users.PremiumUser;

/**
 * Use this class to store the items that are available for purchase.
 *
 * @author Nick
 *
 */
public class ItemToSell {

    private double cost = 0;

    private String name;

    private PremiumUser seller;

    /**
     *
     * @param name
     *            The name of the product
     * @param price
     *            The total price
     * @param poster
     *            The user who posted the item
     */
    public ItemToSell(final String name, final double price, final PremiumUser poster) {
	cost = price;
	this.name = name;
	seller = poster;
    }

    public String getName() {
	return name;
    }

    public PremiumUser getPoster() {
	return seller;
    }

    public double getPrice() {
	return cost;
    }

    @Override
    public String toString() {
	return "Name: " + name + " | Cost: " + String.format("%.2f", cost) + " | Seller: " + seller;
    }

}