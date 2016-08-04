package Store;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Class creates shop with queue of customers and count cashbox, contains
 * constructor and methods for get value queue of customers and count cashbox
 */

public class Store {
	private int countOfCashbox;
	ConcurrentLinkedQueue<Customer> queue;   // queue of customers

	public Store(int countOfCashbox, ConcurrentLinkedQueue<Customer> queue) {
		this.countOfCashbox = countOfCashbox;
		this.queue = queue;
	}

	public int getCountOfCashbox() {
		return countOfCashbox;
	}

	public ConcurrentLinkedQueue<Customer> getQueue() {
		return queue;
	}
}
