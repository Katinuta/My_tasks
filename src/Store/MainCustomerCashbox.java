package Store;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Class exection programm, create shop with input user count of customers and
 * count of cashbox, creates threads of customers, add them to queue and start
 * for exection for print lists of purchases of customers
 */

public class MainCustomerCashbox {

	public static void main(String[] args) {
		ConcurrentLinkedQueue<Customer> queue = new ConcurrentLinkedQueue<Customer>();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Введите количество покупателей:");
			int countOfCustomers = 0, countOfCashbox = 0;
			if (sc.hasNextInt()) {
				countOfCustomers = sc.nextInt(); // get count of customers
			}
			System.out.println("Введите количество касс:");
			if (sc.hasNextInt()) {
				countOfCashbox = sc.nextInt();// get count of cashbox
			}
			// create count of customers equal input user number
			for (int i = 1; i <= countOfCustomers; i++) {
				// create object for get list of purchases for the customer
				Purchases purchases = new Purchases();
				Customer customer = new Customer(i, purchases.createListOfPurchases()); // create
																						// customer
				queue.add(customer); // add to queue the customer
			}
			Store store = new Store(countOfCashbox, queue);
			// create pool of thread by count of cashbox input user
			ExecutorService ex = Executors.newFixedThreadPool(store.getCountOfCashbox());
			Iterator<Customer> it = store.getQueue().iterator();
			while (it.hasNext()) {
				ex.execute(it.next()); // run thread of customer for execution
			}
			ex.shutdown(); // stop all threads
		}

	}

}
