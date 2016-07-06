package HomeTask2_2;

import java.util.Scanner;

/** Class compare 2 input user numbers*/

public class Task2 {
	public static void main(String[] args){
		int num1=0,num2=0; // variable 2 numbers
		System.out.print("Enter first number :");//Print message
		Scanner sc= new Scanner(System.in);// Create object class Scanner
		if (sc.hasNextInt()){// return true if input stream has integer number
			num1=sc.nextInt();//get 1 number
		}
		System.out.print("Enter second number :");//Print message
		if (sc.hasNextInt()){//return true if input stream has integer number
			num2=sc.nextInt();//get 2 number
		}
		if(num1>num2){// compare 2 numbers
			System.out.println("First number "+num1+" more than second number "+num2);//Print message
		}else{
				System.out.println("Second number "+num2+" more than first number "+num1);//Print message
			}
		
		
	}
}
