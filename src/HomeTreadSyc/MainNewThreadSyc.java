package HomeTreadSyc;

import java.util.Scanner;

/** Class creates and executes threads */

public class MainNewThreadSyc {

	public static void main(String[] args) {
		PrintString printString = new PrintString();
		MyThreadSyn first = new MyThreadSyn("Thread 1", printString); // create
																		// thread
		MyThreadSyn second = new MyThreadSyn("Thread 2", printString); // create
																		// thread
		System.out.println("Введите слово \"start\" для начала работы: ");
		try (Scanner sc = new Scanner(System.in)) {
			if (sc.next().compareToIgnoreCase("start") == 0) {
				first.start();
				second.start();
			} else {
				System.out.println("Вы ввели неверное слово для начала работы потоков");
			}
		}
	}

}
