package Account;

/**
 * Class DepositAccount contains constructors for create objects implements
 * methods interface Depositable, override method toString
 */

public class DepositAccount extends Account implements Depositable {

	DepositAccount() {
	}

	DepositAccount(int numberOfAccount, TypeOfCurrency currencyOfAccount, double balance) {
		this.currencyOfAccount = currencyOfAccount;
		this.numberOfAccount = numberOfAccount;
		this.typeOfAccount = "deposit";
		this.status = true;
		this.balance = balance;
	}

	@Override
	public double getIncome(double percantageInCome) {
		double income = balance * percantageInCome / 100;
		return income;
	}

	@Override
	public void excludeDeposit(double sum) {
		balance -= sum;
	}

	@Override
	public String toString() {
		return "Номер договора: " + numberOfAccount + ", тип валюты: " + currencyOfAccount.toString() + ", тип счета: "
				+ typeOfAccount + ", остаток: " + balance;
	}

	@Override
	public void addBalance(double sum) {
		balance += sum;
	}

}
