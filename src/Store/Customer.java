package Store;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class creates thread of customer, contains constructor override methods run
 */

public class Customer implements Runnable {
	private String name;
	private ArrayList<String> listOfPurchases;

	public Customer(int number, ArrayList<String> listOfPurchases) {
		this.listOfPurchases = listOfPurchases;
		this.name = "Customer " + number;
		new Thread(this, this.name);
	}

	public void run() {
		//print list of purchases the customer
		Iterator<String> it = listOfPurchases.iterator();
		while (it.hasNext()) {
			System.out.println(name + ": " + it.next());
		}
	}
}
