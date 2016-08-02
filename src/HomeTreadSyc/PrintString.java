package HomeTreadSyc;

/**
 * Class resource for work threads contain methods for print  string with 10 element 
 * synchronized that create in threads
 */

public class PrintString {
	private int i = 1;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public synchronized void print(String name) {

		StringBuffer string = new StringBuffer();
		int i = this.i; // get current value of member of class variable "i"
		for (; i <= 100; i++) {
			string.append(i).append(" "); // append to string value
			if (i % 10 == 0) {
				System.out.println(name + ":" + string.toString()); // print
																	// string
				string = new StringBuffer(); // resert string
				this.i = i + 1; // set new value
				try {
					notify();
					wait();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				i = this.i - 1; // get new value "i" for thread after waiting
			}

		}

	}

}
