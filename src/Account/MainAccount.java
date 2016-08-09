package Account;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/** Main class for work program */

public class MainAccount {

	public static void main(String[] args) throws MyException {
		try (Scanner sc = new Scanner(System.in)) {
			sc.useLocale(Locale.US);
			ClientUtility clientUtility = new ClientUtility();
			String file = "Resource/MessagesBundleAccount";
			Locale localeRu = new Locale("ru", "RU");
			Locale localeEn = new Locale("en", "US");
			Date currentDate = new Date();
			DateFormat date = DateFormat.getDateInstance(DateFormat.FULL, localeRu);
			System.out.print(date.format(currentDate));
			System.out.println(DateFormat.getTimeInstance().format(currentDate));
			ResourceBundle resourceBundleCurrent = ResourceBundle.getBundle(file, localeRu);
			System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "mainMenu"));
			System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "ruLanguage"));
			System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "enLanguage"));
			int numberLang = sc.nextInt();
			if (numberLang == 2) {
				resourceBundleCurrent = ResourceBundle.getBundle(file, localeEn);
			}
			while (true) {
				System.out
						.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "chooseOperation"));
				System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "newClient"));
				System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "oldClient"));
				System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "quit"));
				int operation = sc.nextInt();
				switch (operation) {
				case 1: {
					// instruction for new client
					System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "nameFamily"));
					String surname = sc.next();
					System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "name"));
					String firstName = sc.next();
					// create new client
					clientUtility.createClient(firstName, surname);
					break;
				}
				case 2: {// instruction for old client
					System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "nameFamily"));
					String surname = sc.next();
					System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "name"));
					String firstName = sc.next();
					int index = clientUtility.findClient(firstName, surname);
					if (index >= 0) {
						// get choose client
						Client client = (clientUtility.getListOfClients()).get(index);
						System.out.println("\n\n" + client.toString() + "\n");
						System.out.println(
								MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "chooseOperation"));
						System.out.println(
								MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "newAccount"));
						System.out.println(
								MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "searchAccount"));
						System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "sort"));
						System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "allSum"));
						System.out
								.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "debitSum"));
						System.out.println(
								MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "creditSum"));
						System.out.println(
								MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "changeBalance"));
						switch (sc.nextInt()) {
						case 1: {
							System.out
									.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "type"));
							System.out.println(
									MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "deposit"));
							System.out.println(
									MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "credit"));
							System.out
									.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "card"));
							int number = sc.nextInt();
							if (number == 1) {
								// create new account deposit
								MenuUtilityDeposit.createDepositAccount(sc, clientUtility, client,resourceBundleCurrent);
							}
							if (number == 2) {
								// create new account credit
								MenuUtilityCredit.createCreditAccount(sc, clientUtility, client,resourceBundleCurrent);
							}
							if (number == 3) {
								// create new card credit
								MenuUtilityCard.createCardAccount(sc, clientUtility, client,resourceBundleCurrent);
							}
							break;
						}
						case 2: {
							// instruction for search account
							MenuOverallUtility.menuSearchAccount(sc, clientUtility, client,resourceBundleCurrent);
							break;
						}
						case 3: {
							// instruction for sorts account by balance
							MenuOverallUtility.menuSortAccounts(clientUtility, client,resourceBundleCurrent);
							break;
						}
						case 4: {
							// calculate overall sum of all account by types
							// currency
							MenuOverallUtility.calculateOverralSum(clientUtility, client,resourceBundleCurrent);
							break;
						}
						case 5: {
							// calculate overall sum of all debit account by
							// types currency
							MenuUtilityDeposit.calculateSumDeposit(clientUtility, client,resourceBundleCurrent);
							break;
						}
						case 6: {
							// calculate overall sum of all credit by types
							// currency
							MenuUtilityCredit.calculateCreditAccount(clientUtility, client,resourceBundleCurrent);
							break;
						}
						case 7: {// change balance
							System.out
									.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "type"));
							System.out.println(
									MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "deposit"));
							System.out.println(
									MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "credit"));
							System.out
									.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "card"));
							int num = sc.nextInt();
							switch (num) {
							case 1: {// change balance deposit account
								System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,
										"chooseOperation"));
								System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,
										"addDeposit"));
								System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,
										"withdrawDeposit"));
								System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,
										"capitalization"));
								int oper = sc.nextInt();
								switch (oper) {
								case 1: {
									// add balance of deposit account
									MenuUtilityDeposit.menuAddBalance(sc, clientUtility, client,resourceBundleCurrent);
									continue;
								}
								case 2: {
									// get deposit sum
									MenuUtilityDeposit.menuGetDeposit(sc, clientUtility, client,resourceBundleCurrent);
									continue;
								}
								case 3: {
									// calculate income and capitalization
									// income to balance
									MenuUtilityDeposit.menuIncome(sc, clientUtility, client,resourceBundleCurrent);
									break;
								}
								}
							}
							case 2: {// change balance of credit account
								System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,
										"chooseOperation"));
								System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,
										"repayCredit"));
								System.out.println(
										MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "getCredit"));
								System.out.print(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,
										"percentagesForUse"));
								int oper = sc.nextInt();
								switch (oper) {
								case 1: {
									// repay credit
									MenuUtilityCredit.repayCredit(sc, clientUtility, client,resourceBundleCurrent);
									continue;
								}
								case 2: {
									// get credit
									MenuUtilityCredit.menuGetCredit(sc, clientUtility, client,resourceBundleCurrent);
									continue;
								}
								case 3: {
									// Calculate percentages for use and
									// increase credit sum
									MenuUtilityCredit.menuPercentages(sc, clientUtility, client,resourceBundleCurrent);
									break;
								}
								}
							}
							case 3: {
								// change balance of card account
								System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,
										"chooseOperation"));
								System.out.println(
										MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "addCard"));
								System.out.println(
										MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "getCash"));
								int oper = sc.nextInt();
								switch (oper) {
								case 1: {
									// add balance of card account
									MenuUtilityCard.menuAddBalance(sc, clientUtility, client,resourceBundleCurrent);
									continue;
								}
								case 2: {
									// get cash from ATM
									MenuUtilityCard.menuGetCash(sc, clientUtility, client,resourceBundleCurrent);
									continue;
								}
								}

							}
							}
						}
						}
					} else {

						System.out.println(
								MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "messageNotClient"));
					}
					break;
				}
				default: {
					System.exit(0);
				}
				}
			}
		}
	}
}