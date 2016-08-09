package Account;

/**
 * Class CreditAccount contains constructors for create objects implements
 * methods interface Creditable, override method toString
 */

public class CreditAccount extends Account implements Creditable {
	public CreditAccount() {
	}

	public CreditAccount(int numberOfAccount, TypeOfCurrency currencyOfAccount, double balance) {
		this.currencyOfAccount = currencyOfAccount;
		this.numberOfAccount = numberOfAccount;
		this.typeOfAccount = "credit";
		this.status = true;
		this.balance = balance;
	}

	@Override
	public double getSumOfPercetagesForUse(double percetagesForUse) {
		double SumOfPercetagesForUse = Math.abs(balance) * percetagesForUse / 100;
		return SumOfPercetagesForUse;
	}

	@Override
	public void repayCredit(double sum) {
		balance += sum;
	}

	@Override
	public void increaseCredit(double sum) {
		balance -= sum;
	}

	@Override
	public String toString() {
		return "Номер договора: " + numberOfAccount + ", тип валюты: " + currencyOfAccount.toString() + ", тип счета: "
				+ typeOfAccount + ", задолженность" + balance;
	}
}
