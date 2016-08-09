package Account;

/** Interface Depositable contains methods for deposit account */

public interface Depositable {
	double getIncome(double percantageIncome);

	void excludeDeposit(double sum);

	void addBalance(double sum);
}
