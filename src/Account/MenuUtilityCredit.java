package Account;

import java.util.ResourceBundle;
import java.util.Scanner;

/** Class contains methods for execution menu for credit accounts */

public class MenuUtilityCredit {

	// create credit account
	public static void createCreditAccount(Scanner sc, ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) throws MyException {
		try {
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "numberAccount"));
			int numberOfAccount = sc.nextInt();
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "currency"));
			String currency = (sc.next()).toUpperCase();
			TypeOfCurrency currencyOfAccount = TypeOfCurrency.valueOf(currency);
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "sumCreditAccount"));
			double balance = -sc.nextDouble();
			if (balance > 0) {
				throw new MyException();
			}
			// create user's new account credit and write it in array of user's
			// account
			clientUtility.createCreditAccount(client, numberOfAccount, currencyOfAccount, balance);
		} catch (MyException me) {
			System.out.println(
					MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNegativeSumCredit"));
		}
	}

	// calculate overall sum of all credit by types currency
	public static void calculateCreditAccount(ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) {
		System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "accountsClients")
				+ client.getFirstName() + " " + client.getSurname());
		clientUtility.display(client.getlistOfAccounts());
		double sumOfCreditByn = clientUtility.calculateOverallBalance(client.getlistOfAccounts(), "credit",
				TypeOfCurrency.BYN);
		System.out.printf(
				MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "amountCredit") + " %s - %.2f\n",
				(TypeOfCurrency.BYN).toString(), sumOfCreditByn);
		double sumOfCreditEuro = clientUtility.calculateOverallBalance(client.getlistOfAccounts(), "credit",
				TypeOfCurrency.EURO);
		System.out.printf(
				MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "amountCredit") + " %s - %.2f\n",
				(TypeOfCurrency.EURO).toString(), sumOfCreditEuro);
		double sumOfCreditUsd = clientUtility.calculateOverallBalance(client.getlistOfAccounts(), "credit",
				TypeOfCurrency.USD);
		System.out.printf(
				MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "amountCredit") + " %s - %.2f\n",
				(TypeOfCurrency.USD).toString(), sumOfCreditUsd);
	}

	// repay credit
	public static void repayCredit(Scanner sc, ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) throws MyException {
		try {
			System.out
					.println("\n" + MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "accountsClients")
							+ client.getFirstName() + " " + client.getSurname());
			clientUtility.display(client.getlistOfAccounts());
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "numberAccount"));
			int numberOfAccount = sc.nextInt();
			int indexForChange = clientUtility.findNumberOfAccount(client.getlistOfAccounts(), numberOfAccount,
					"credit");
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,"repaySum "));
			double sum = sc.nextDouble();
			if (sum < 0) {
				throw new MyException();
			}
			if (indexForChange >= 0) {
				double balance = (client.getlistOfAccounts()).get(indexForChange).getBalance();
				if (Math.abs(balance) >= sum) {
					CreditAccount account = (CreditAccount) (client.getlistOfAccounts()).get(indexForChange);
					account.repayCredit(sum);
					System.out.println(account.toString());
				} else {
					System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,"messageRepayCredit"));
				}
			} else {
				System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,"messageNotCredit"));
			}
		} catch (MyException me) {
			System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,"creditSumNegative"));
		}
	}

	// get credit
	public static void menuGetCredit(Scanner sc, ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) throws MyException {
		try {
			System.out
					.println("\n" + MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "accountsClients")
							+ client.getFirstName() + " " + client.getSurname());
			clientUtility.display(client.getlistOfAccounts());
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "numberAccount"));
			int numberOfAccount = sc.nextInt();
			int indexForChange = clientUtility.findNumberOfAccount(client.getlistOfAccounts(), numberOfAccount,
					"credit");
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "needSumCredit"));
			double sum = sc.nextDouble();
			if (sum < 0) {
				throw new MyException();
			}
			if (indexForChange >= 0) {
				CreditAccount account = (CreditAccount) (client.getlistOfAccounts()).get(indexForChange);
				account.increaseCredit(sum);
				System.out.println(account.toString());
			} else {
				System.out
						.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNotCredit"));
			}
		} catch (MyException me) {
			System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "needSumNegative"));
		}
	}

	// Calculate percentages for use and increase credit sum
	public static void menuPercentages(Scanner sc, ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) {
		System.out.println("\n" + MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "accountsClients")
				+ client.getFirstName() + " " + client.getSurname());
		clientUtility.display(client.getlistOfAccounts());
		System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "numberAccount"));
		int numberOfAccount = sc.nextInt();
		int indexForChange = clientUtility.findNumberOfAccount(client.getlistOfAccounts(), numberOfAccount, "credit");
		System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "percentagesCredit"));
		double percentagesForUse = sc.nextDouble();
		if (indexForChange >= 0) {
			CreditAccount account = (CreditAccount) (client.getlistOfAccounts()).get(indexForChange);
			double payForUse = account.getSumOfPercetagesForUse(percentagesForUse);
			System.out.print(
					MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "sumPercentagesUse") + payForUse);
			account.setBalance(account.getBalance() - payForUse);
			System.out.println(account.toString());
		} else {
			System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNotCredit"));
		}
	}
}
