package HomeTread;

import java.util.Scanner;

/**Class creates and starts threads for execution after input user word "start"*/

public class MainNewTread {

	public static void main(String[] args) {
		System.out.println("Введите слово \"start\" для начала работы: ");
		NewThread first = new NewThread("Thread 1");	//create thread
		NewThread second = new NewThread("Thread 2");	//create thread
		try (Scanner sc = new Scanner(System.in)) {
			if ((sc.next()).compareTo("start") == 0) {
				first.start();					//start first thread
				second.start();					//start second thread
			} else {
				System.out.println("Вы ввели неверное слово для начала работы потоков");
			}

		}
	}
}
