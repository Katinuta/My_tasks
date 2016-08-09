package Account;

import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;
import java.util.Scanner;

/** Class contains methods for execution menu for all accounts */

public class MenuOverallUtility {
	// calculate overall sum of all account by types currency
	public static void calculateOverralSum(ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) {
		System.out.println("\n" + getStringFromProperties(resourceBundleCurrent, "accountsClients")
				+ client.getFirstName() + " " + client.getSurname());
		clientUtility.display(client.getlistOfAccounts());
		double sumByn = clientUtility.calculateOverallBalance(client.getlistOfAccounts(), TypeOfCurrency.BYN);

		System.out.printf(getStringFromProperties(resourceBundleCurrent, "amountAccounts") + " %s - %.2f\n",
				(TypeOfCurrency.BYN).toString(), sumByn);
		double sumEuro = clientUtility.calculateOverallBalance(client.getlistOfAccounts(), TypeOfCurrency.EURO);

		System.out.printf(getStringFromProperties(resourceBundleCurrent, "amountAccounts") + "%s - %.2f\n",
				(TypeOfCurrency.EURO).toString(), sumEuro);

		double sumUsd = clientUtility.calculateOverallBalance(client.getlistOfAccounts(), TypeOfCurrency.USD);

		System.out.printf(getStringFromProperties(resourceBundleCurrent, "amountAccounts") + " %s - %.2f\n",
				(TypeOfCurrency.USD).toString(), sumUsd);
	}

	// instruction for search account
	public static void menuSearchAccount(Scanner sc, ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) throws MyException {
		try {
			System.out.println("\n" + getStringFromProperties(resourceBundleCurrent, "accountsClients")
					+ client.getFirstName() + " " + client.getSurname());
			clientUtility.display(client.getlistOfAccounts());
			System.out.print(getStringFromProperties(resourceBundleCurrent, "searchType"));
			String type = (sc.next()).toLowerCase();
			if (type.compareTo("deposit") != 0 || type.compareTo("credit") != 0 || type.compareTo("card") != 0) {
				throw new MyException();
			}
			clientUtility.searchAccounts(type, client.getlistOfAccounts());
		} catch (MyException me) {
			System.out.println(getStringFromProperties(resourceBundleCurrent, "notType"));
			System.out.println(getStringFromProperties(resourceBundleCurrent, "repeat"));
		}
	}

	// instruction for sorts account by balance
	public static void menuSortAccounts(ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) {
		System.out.println("\n" + getStringFromProperties(resourceBundleCurrent, "repeat") + client.getFirstName() + " "
				+ client.getSurname());
		clientUtility.display(client.getlistOfAccounts());
		System.out.println("\n" + getStringFromProperties(resourceBundleCurrent, "sortAccounts") + "\n");
		clientUtility.sortAccounts(client.getlistOfAccounts());
	}

	// method get string from properties
	public static String getStringFromProperties(ResourceBundle resourceBundleCurrent, String key) {
		String newString = "";
		try {
			newString = new String(resourceBundleCurrent.getString(key).getBytes("ISO-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return newString;
	}

}
