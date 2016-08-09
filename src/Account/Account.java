package Account;

/**
 * Abstract class for all types of accounts. It contains also methods for get
 * and values of members of class
 */

public abstract class Account {
	protected TypeOfCurrency currencyOfAccount;
	protected int numberOfAccount;
	protected String typeOfAccount;
	protected boolean status;
	protected double balance;

	public TypeOfCurrency getCurrencyOfAccount() {
		return currencyOfAccount;
	}

	public void setCurrencyOfAccount(TypeOfCurrency currencyOfAccount) {
		this.currencyOfAccount = currencyOfAccount;
	}

	public int getNumberOfAccount() {
		return numberOfAccount;
	}

	public void setNumberOfAccount(int numberOfAccount) {
		this.numberOfAccount = numberOfAccount;
	}

	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((currencyOfAccount == null) ? 0 : currencyOfAccount.hashCode());
		result = prime * result + numberOfAccount;
		result = prime * result + ((typeOfAccount == null) ? 0 : typeOfAccount.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (currencyOfAccount != other.currencyOfAccount)
			return false;
		if (numberOfAccount != other.numberOfAccount)
			return false;
		if (typeOfAccount == null) {
			if (other.typeOfAccount != null)
				return false;
		} else if (!typeOfAccount.equals(other.typeOfAccount))
			return false;
		return true;
	}
}
