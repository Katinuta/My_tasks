package Account;

import java.util.ResourceBundle;
import java.util.Scanner;

/** Class contains methods for execution menu for card accounts */

public class MenuUtilityCard {
	// create card account
	public static void createCardAccount(Scanner sc, ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) {
		System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "numberAccount"));
		int numberOfAccount = sc.nextInt();
		System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "currency"));
		String currency = (sc.next()).toUpperCase();
		TypeOfCurrency currencyOfAccount = TypeOfCurrency.valueOf(currency);
		// create user's new account card and write it in array of user's
		// account
		clientUtility.createCardAccount(client, numberOfAccount, currencyOfAccount);
	}

	// add balance of card account
	public static void menuAddBalance(Scanner sc, ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) {
		try {
			System.out
					.println("\n" + MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "accountsClients")
							+ client.getFirstName() + " " + client.getSurname());
			clientUtility.display(client.getlistOfAccounts());
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "numberAccount "));
			int numberOfAccount = sc.nextInt();
			int indexForChange = clientUtility.findNumberOfAccount(client.getlistOfAccounts(), numberOfAccount, "card");
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "addSum"));
			double sum = sc.nextDouble();
			if (sum < 0) {
				throw new MyException();
			}
			if (indexForChange >= 0) {
				CardAccount account = (CardAccount) (client.getlistOfAccounts()).get(indexForChange);
				account.addBalance(sum);
				System.out.println(account.toString());
			} else {
				System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNotCard"));
			}
		} catch (MyException me) {
			System.out.println(
					MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNegativeSumAdd"));
		}
	}

	// get cash from ATM
	public static void menuGetCash(Scanner sc, ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) {
		try {
			System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "accountsClients ")
					+ client.getFirstName() + " " + client.getSurname());
			clientUtility.display(client.getlistOfAccounts());
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "numberAccount"));
			int numberOfAccount = sc.nextInt();
			int indexForChange = clientUtility.findNumberOfAccount(client.getlistOfAccounts(), numberOfAccount, "card");
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "sumReduce"));
			int sum = sc.nextInt();
			if (sum < 0) {
				throw new MyException();
			}
			if (indexForChange >= 0) {
				if (sum <= ((client.getlistOfAccounts()).get(indexForChange)).getBalance()) {
					CardAccount account = (CardAccount) (client.getlistOfAccounts()).get(indexForChange);
					account.getCash(sum);
					System.out.println(account.toString());
				} else {
					System.out.println(
							MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageReduceCard"));
				}
			} else {
				System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNotCard"));
			}
		} catch (MyException me) {
			System.out.println(
					MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNegativeSumReduce"));
		}
	}
}
