package HomeTask2Add_2;

import java.util.Scanner;

/**Class calculates sum of numbers according to the formula where number terms input user */

public class Task2Add {
	public static void main(String [] args){
		System.out.println("Введите число: ");		//print message
		double sum= 0;						  		//variable sum of numbers
		Scanner sc =new Scanner(System.in);  		//create object of class Scanner
		int num=sc.nextInt();						//get amount of numbers
		for(double i=1;i<=num;i++){					//cycle for calculate sum 
			sum+=(1/i);						   		//add to sum next value
		}
		System.out.println("Сумма составит: "+ sum);//print message of sum of numbers
	}
}
