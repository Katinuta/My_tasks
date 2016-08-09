package Account;

import java.util.Comparator;

/** Class condition sort of list */

public class SortComparator implements Comparator<Account> {
	@Override
	public int compare(Account ac1, Account ac2) {
		return (int) Math.ceil(ac1.getBalance() - ac2.getBalance());
	}
}
