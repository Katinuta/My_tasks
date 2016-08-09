package Account;

/** Interface Creditable contains methods for credit account */

public interface Creditable {
	double getSumOfPercetagesForUse(double percetagesForUse);

	void repayCredit(double sum);

	void increaseCredit(double sum);
}
