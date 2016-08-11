package Account;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/** Main class for work program */

public class MainAccount {

	public static void main(String[] args) throws MyException {
		try (Scanner sc = new Scanner(System.in)) {
			File fileAction=new File("action.txt"); //create file for write actions user
			try {
				fileAction.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			sc.useLocale(Locale.US);
			Singleton.getInstance(); // create object for write actions user
			ClientUtility clientUtility = new ClientUtility();
			String file = "Resource/MessagesBundleAccount"; 
			Locale localeRu = new Locale("ru", "RU");  
			Locale localeEn = new Locale("en", "US");
			Date currentDate = new Date();  //get current date and time
			DateFormat date = DateFormat.getDateInstance(DateFormat.FULL, localeRu); //print date
			System.out.print(date.format(currentDate));
			System.out.println(DateFormat.getTimeInstance().format(currentDate));  //print time
			ResourceBundle resourceBundleCurrent = ResourceBundle.getBundle(file, localeRu);
			System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "mainMenu"));
			System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "ruLanguage"));
			System.out.println(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "enLanguage"));
			
			int numberLang = sc.nextInt();
			if (numberLang == 2) {
				//write action user
				Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "enLanguage"));
				resourceBundleCurrent = ResourceBundle.getBundle(file, localeEn);			// change locale ResourceBundle
			}else{
				//write action user
				Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "ruLanguage"));
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
					clientUtility.createClient(firstName, surname);// create new client
					Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "newClient"));
					break;
				}
				case 2: {
					// instruction for old client
					Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "oldClient"));
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
							Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "newAccount"));
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
								Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "deposit"));
								// create new account deposit
								MenuUtilityDeposit.createDepositAccount(sc, clientUtility, client,resourceBundleCurrent);
							}
							if (number == 2) {
								Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "credit"));
								// create new account credit
								MenuUtilityCredit.createCreditAccount(sc, clientUtility, client,resourceBundleCurrent);
							}
							if (number == 3) {
								Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "card"));
								// create new card credit
								MenuUtilityCard.createCardAccount(sc, clientUtility, client,resourceBundleCurrent);
							}
							break;
						}
						case 2: {
							//write action user
							Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "searchAccount"));
							// instruction for search account
							MenuOverallUtility.menuSearchAccount(sc, clientUtility, client,resourceBundleCurrent);
							break;
						}
						case 3: {
							Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "sort"));
							// instruction for sorts account by balance
							MenuOverallUtility.menuSortAccounts(clientUtility, client,resourceBundleCurrent);
							break;
						}
						case 4: {
							//write action
							Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "allSum"));
							// calculate overall sum of all account by types
							// currency
							MenuOverallUtility.calculateOverralSum(clientUtility, client,resourceBundleCurrent);
							break;
						}
						case 5: {
							//write action
							Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "debitSum"));
							// calculate overall sum of all debit account by
							// types currency
							MenuUtilityDeposit.calculateSumDeposit(clientUtility, client,resourceBundleCurrent);
							break;
						}
						case 6: {
							Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "creditSum"));
							// calculate overall sum of all credit by types
							// currency
							MenuUtilityCredit.calculateCreditAccount(clientUtility, client,resourceBundleCurrent);
							break;
						}
						case 7: {
							Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "changeBalance"));
							// change balance
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
								Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "deposit"));
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
									Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,
										"addDeposit"));
									// add balance of deposit account
									MenuUtilityDeposit.menuAddBalance(sc, clientUtility, client,resourceBundleCurrent);
									continue;
								}
								case 2: {
									Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,
										"withdrawDeposit"));
									// get deposit sum
									MenuUtilityDeposit.menuGetDeposit(sc, clientUtility, client,resourceBundleCurrent);
									continue;
								}
								case 3: {
									Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,
										"capitalization"));
									// calculate income and capitalization
									// income to balance
									MenuUtilityDeposit.menuIncome(sc, clientUtility, client,resourceBundleCurrent);
									break;
								}
								}
							}
							case 2: {// change balance of credit account
								Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "credit"));
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
									Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,
										"repayCredit"));
									// repay credit
									MenuUtilityCredit.repayCredit(sc, clientUtility, client,resourceBundleCurrent);
									continue;
								}
								case 2: {
									Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "getCredit"));
									// get credit
									MenuUtilityCredit.menuGetCredit(sc, clientUtility, client,resourceBundleCurrent);
									continue;
								}
								case 3: {
									Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent,
										"percentagesForUse"));
									// Calculate percentages for use and
									// increase credit sum
									MenuUtilityCredit.menuPercentages(sc, clientUtility, client,resourceBundleCurrent);
									break;
								}
								}
							}
							case 3: {
								Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "card"));
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
									Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "addCard"));
									// add balance of card account
									MenuUtilityCard.menuAddBalance(sc, clientUtility, client,resourceBundleCurrent);
									continue;
								}
								case 2: {
									Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "getCash"));
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
					Singleton.getInstance().logAction(MenuOverallUtility.getStringFromProperties(resourceBundleCurrent, "quit"));
					System.exit(0);
				}
				}
			}
		}
	}
}