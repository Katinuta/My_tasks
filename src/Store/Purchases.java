package Store;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class contains list of all possible purchases in the shop, constructor for
 * create list and method that randomly creates list of purchases for every
 * customer
 */

public class Purchases {
	private ArrayList<String> purchases = new ArrayList<String>();

	public Purchases() { // list of all possible purchases in the shop
		purchases.add("Milk");
		purchases.add("Bread");
		purchases.add("Tea");
		purchases.add("Spagetti");
		purchases.add("Apple");
		purchases.add("Fish");
		purchases.add("Orange");
		purchases.add("Water");
		purchases.add("Fish");
		purchases.add("Tomato");
		purchases.add("Meat");
		purchases.add("Carrot");

	}

	public ArrayList<String> createListOfPurchases() {
		Random random = new Random();
		ArrayList<String> listOfPurchases = new ArrayList<String>();
		for (int i = 0; i < 2; i++) {
			String string = purchases.get(random.nextInt(purchases.size())); // selection
																				// purchase
			listOfPurchases.add(string); // add to list of purchases customer
											// new purchase
		}
		return listOfPurchases;			//return list of purchases for customer
	}
}
