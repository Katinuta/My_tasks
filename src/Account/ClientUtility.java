package Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Class contains array of clients, methods for working with informations about
 * client
 */

public class ClientUtility {

	private ArrayList<Client> listOfClients = new ArrayList<>();

	public ArrayList<Client> getListOfClients() {
		return listOfClients;
	}

	public void setListOfClients(ArrayList<Client> listOfClients) {
		this.listOfClients = listOfClients;
	}

	public void createDepositAccount(Client client, int numberOfAccount, TypeOfCurrency currencyOfAccount,
			double balance) {
		DepositAccount deposit = new DepositAccount(numberOfAccount, currencyOfAccount, balance);
		(client.getlistOfAccounts()).add(deposit);

	}

	public void createCreditAccount(Client client, int numberOfAccount, TypeOfCurrency currencyOfAccount,
			double balance) {

		CreditAccount credit = new CreditAccount(numberOfAccount, currencyOfAccount, balance);
		(client.getlistOfAccounts()).add(credit);
	}

	public void createClient(String firstName, String surname) {

		Client client = new Client(firstName, surname);
		listOfClients.add(client);
	}

	public void createCardAccount(Client client, int numberOfAccount, TypeOfCurrency currencyOfAccount) {

		CardAccount card = new CardAccount(numberOfAccount, currencyOfAccount);
		(client.getlistOfAccounts()).add(card);
	}

	public int findClient(String firstName, String surname) {
		Client client = new Client(firstName, surname);
		int index = listOfClients.indexOf(client);
		return index;
	}

	public void searchAccounts(String typeOfAccount, ArrayList<Account> list) {
		Iterator<Account> it = list.iterator();
		while (it.hasNext()) {
			Account account = it.next();
			if ((account.typeOfAccount).compareTo(typeOfAccount) == 0) {
				System.out.println((account).toString());
			}
		}
	}

	public void sortAccounts(ArrayList<Account> list) {

		Collections.sort(list, new SortComparator());
		Iterator<Account> it = list.iterator();
		while (it.hasNext()) {
			System.out.println((it.next()).toString());
		}
	}

	public double calculateOverallBalance(ArrayList<Account> list, TypeOfCurrency currencyOfAccount) {
		double overallSum = 0;
		Iterator<Account> it = list.iterator();
		while (it.hasNext()) {
			Account account = it.next();
			if ((account.getCurrencyOfAccount()).compareTo(currencyOfAccount) == 0) {
				overallSum += account.getBalance();
			}
		}
		return overallSum;
	}

	public double calculateOverallBalance(ArrayList<Account> list, String typeOfAccount,
			TypeOfCurrency currencyOfAccount) {
		double overallSum = 0;
		Iterator<Account> it = list.iterator();
		while (it.hasNext()) {
			Account account = it.next();
			if ((account.getCurrencyOfAccount()).compareTo(currencyOfAccount) == 0
					&& (account.getTypeOfAccount()).compareTo(typeOfAccount) == 0) {
				overallSum += account.getBalance();
			}
		}
		return overallSum;
	}

	public void display(ArrayList<Account> list) {
		Iterator<Account> it = list.iterator();
		while (it.hasNext()) {
			System.out.println((it.next()).toString());
		}
	}

	public int findNumberOfAccount(ArrayList<Account> list, int numberOfAccount, String typeOfAccount) {
		Iterator<Account> it = list.iterator();
		int index = -1;
		while (it.hasNext()) {
			index++;
			Account account = it.next();
			if (account.getNumberOfAccount() == numberOfAccount
					&& (account.getTypeOfAccount()).compareTo(typeOfAccount) == 0) {
				break;
			}
		}
		return index;
	}
}
