package Account;

import java.util.ResourceBundle;
import java.util.Scanner;

/** Class contains methods for execution menu for deposit accounts */

public class MenuUtilityDeposit {

	// create new account deposit
	public static void createDepositAccount(Scanner sc, ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) throws MyException {
		try {
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "numberAccount"));
			int numberOfAccount = sc.nextInt();
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "currency"));
			String currency = (sc.next()).toUpperCase();
			TypeOfCurrency currencyOfAccount = TypeOfCurrency.valueOf(currency);
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "sumDebitContract"));
			double balance = sc.nextDouble();
			if (balance < 0) {
				throw new MyException();
			}
			// create user's new account deposit and write
			// it in array of user's account
			clientUtility.createDepositAccount(client, numberOfAccount, currencyOfAccount, balance);
		} catch (MyException me) {
			System.out.println(
					MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNegativeSumDebit"));
		}
	}

	// calculate overall sum of all debit account by types currency
	public static void calculateSumDeposit(ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) {
		System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "accountsClients")
				+ client.getFirstName() + " " + client.getSurname());
		clientUtility.display(client.getlistOfAccounts());
		double sumOfDebetByn = clientUtility.calculateOverallBalance(client.getlistOfAccounts(), "deposit",
				TypeOfCurrency.BYN);
		sumOfDebetByn += clientUtility.calculateOverallBalance(client.getlistOfAccounts(), "card", TypeOfCurrency.BYN);
		System.out.printf(
				MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "amountDebit") + " %s - %.2f\n",
				(TypeOfCurrency.BYN).toString(), sumOfDebetByn);
		double sumOfDebetEuro = clientUtility.calculateOverallBalance(client.getlistOfAccounts(), "deposit",
				TypeOfCurrency.EURO);
		sumOfDebetEuro += clientUtility.calculateOverallBalance(client.getlistOfAccounts(), "card",
				TypeOfCurrency.EURO);
		System.out.printf(
				MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "amountDebit") + " %s - %.2f\n",
				(TypeOfCurrency.EURO).toString(), sumOfDebetEuro);
		double sumOfDebetUsd = clientUtility.calculateOverallBalance(client.getlistOfAccounts(), "deposit",
				TypeOfCurrency.USD);
		sumOfDebetUsd += clientUtility.calculateOverallBalance(client.getlistOfAccounts(), "card", TypeOfCurrency.USD);
		System.out.printf(
				MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "amountDebit") + " %s - %.2f\n",
				(TypeOfCurrency.USD).toString(), sumOfDebetUsd);
	}

	// add sum to balance account
	public static void menuAddBalance(Scanner sc, ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) throws MyException {
		try {
			System.out
					.println("\n" + MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "accountsClients")
							+ client.getFirstName() + " " + client.getSurname());
			clientUtility.display(client.getlistOfAccounts());
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "numberAccount"));
			int numberOfAccount = sc.nextInt();
			int indexForChange = clientUtility.findNumberOfAccount(client.getlistOfAccounts(), numberOfAccount,
					"deposit");
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "addSum"));
			double sum = sc.nextDouble();
			if (sum <= 0) {
				throw new MyException();
			}
			if (indexForChange >= 0) {
				DepositAccount account = (DepositAccount) (client.getlistOfAccounts()).get(indexForChange);
				account.addBalance(sum);
				System.out.println(account.toString());
			} else {
				System.out.println(
						MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNotDeposit"));
			}
		} catch (MyException me) {
			System.out.println(
					MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNegativeSumAdd"));
		}
	}

	// get deposit sum
	public static void menuGetDeposit(Scanner sc, ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) throws MyException {
		try {
			System.out
					.println("\n" + MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "accountsClients")
							+ client.getFirstName() + " " + client.getSurname());
			clientUtility.display(client.getlistOfAccounts());
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "numberAccount"));
			int numberOfAccount = sc.nextInt();
			int indexForChange = clientUtility.findNumberOfAccount(client.getlistOfAccounts(), numberOfAccount,
					"deposit");
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "sumReduce"));
			double sum = sc.nextDouble();
			if (sum < 0) {
				throw new MyException();
			}
			if (indexForChange >= 0) {
				if (sum <= ((client.getlistOfAccounts()).get(indexForChange)).getBalance()) {
					DepositAccount account = (DepositAccount) (client.getlistOfAccounts()).get(indexForChange);
					account.excludeDeposit(sum);
					System.out.println(account.toString());
				} else {
					System.out.println(
							MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageReduceDeposit"));
				}
			} else {
				System.out.println(
						MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNotDeposit"));
			}
		} catch (MyException me) {
			System.out.println(
					MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNegativeSumReduce"));
		}
	}

	// calculate income and capitalization income to balance
	public static void menuIncome(Scanner sc, ClientUtility clientUtility, Client client,
			ResourceBundle resourceBundleCurrent) {
		System.out.println("\n" + MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "accountsClients")
				+ client.getFirstName() + " " + client.getSurname());
		clientUtility.display(client.getlistOfAccounts());
		System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "numberAccount"));
		int numberOfAccount = sc.nextInt();
		int indexForChange = clientUtility.findNumberOfAccount(client.getlistOfAccounts(), numberOfAccount, "deposit");
		System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "percentagesDeposit"));
		double percantageInCome = sc.nextDouble();
		if (indexForChange >= 0) {
			DepositAccount account = (DepositAccount) (client.getlistOfAccounts()).get(indexForChange);
			double inCome = account.getIncome(percantageInCome);
			System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "income") + inCome);
			account.setBalance(account.getBalance() + inCome);
			System.out.println(account.toString());
		} else {
			System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNotDeposit"));
		}
	}
}
