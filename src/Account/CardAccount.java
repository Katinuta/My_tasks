package Account;

/**
 * Class CardAccount contains constructors for create objects implements methods
 * interface CashMachinable, override method toString
 */

public class CardAccount extends Account implements CashMachinable {
	CardAccount() {
	}

	CardAccount(int numberOfAccount, TypeOfCurrency currencyOfAccount) {
		this.currencyOfAccount = currencyOfAccount;
		this.numberOfAccount = numberOfAccount;
		this.typeOfAccount = "card";
		this.status = true;
	}

	@Override
	public void getCash(int sumOfCash) {
		balance -= sumOfCash;
	}

	@Override
	public void addBalance(double sum) {
		balance += sum;
	}

	@Override
	public String toString() {
		return "Номер договора: " + numberOfAccount + ", тип валюты: " + currencyOfAccount.toString() + ", тип счета: "
				+ typeOfAccount + ", остаток: " + balance;
	}

}
