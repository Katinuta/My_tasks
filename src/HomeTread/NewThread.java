package HomeTread;

/**
 * Class creates threads with name,identified constructor,override method run
 * that creates and prints new string
 */

public class NewThread extends Thread {
	private String name;

	public NewThread(String name) {
		super(name);
		this.name = name;
	}

	public void run() {

		StringBuffer string = new StringBuffer("");
		for (int i = 1; i <= 100; i++) {
			string.append(i).append(" ");					//create string with 10 element
			if (i % 10 == 0) {
				System.out.println(name + ":" + string.toString());		//print string
				string = new StringBuffer("");				// reset string

			}
		}
	}
}
