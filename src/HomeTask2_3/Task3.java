package HomeTask2_3;

import java.util.Scanner;

/**Class divides 2 input number*/

public class Task3 {
	public static void main(String[] args){
		System.out.print("Enter first number:");//print message
		Scanner sc = new Scanner(System.in);//create object class Scanner
		int num1=sc.nextInt();//get 1 number
		System.out.print("Enter second number:");//print message
		int num2=sc.nextInt();//get 2 number
		double result= (double)num1/(double)num2;//result of division
		System.out.println("Result of division: "+result);//print message
	}
}
