package HomeTask2_4;

import java.util.Scanner;

/** Class defines a leap year*/

public class Task4 {
	public static void main(String [] args){
		System.out.print("Введите год:");//print message
		Scanner sc = new Scanner(System.in);//create object class Scanner
		int year=sc.nextInt();//get year from input stream
		if(year%4==0){ //condition for leap year
			if(year%100==0){////condition for leap year
				if(year%400==0){//condition for leap year
					System.out.print(year+ "  Год высокосный");//print message
				}
				else{
					System.out.print(year+ "  Год не высокосный");//print message
				}
			}
			else{
				System.out.print(year+ "  Год высокосный");//print message
			}
		}
		else{
			System.out.print(year+ "  Год не высокосный");//print message
		}
	}
}
