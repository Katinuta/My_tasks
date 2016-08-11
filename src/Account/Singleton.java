package Account;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/** Class contains method that write action user with date and time in file */

public class Singleton {
	private static Singleton instance;

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// method writes action user with time and date
	public void logAction(String action) {
		try (FileWriter writer = new FileWriter("action.txt", true)) {
			StringBuffer aboutAction = new StringBuffer();
			Date currentDate = new Date(); // get current date ant time
			aboutAction.append(action).append(" ").append(currentDate.toString()).append(" "); // append
																								// action
																								// time and
																								// date
			writer.write(aboutAction.toString()); // write in file information
			writer.write("\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
