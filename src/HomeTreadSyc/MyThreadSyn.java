package HomeTreadSyc;

/** Class of threads with  name, idenfinied constructor, override method run
 * that call metthod Class PrintString  */

public class MyThreadSyn extends Thread {
	String name;
	PrintString printString;

	public MyThreadSyn(String name, PrintString printString) {
		super(name);
		this.name = name;
		this.printString = printString;
	}

	public void run() {
		printString.print(name);	//call for execute method Class PrintString

	}
}
