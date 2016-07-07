package HomeTask2Add_5;

import java.util.Scanner;

/**Class calculates and prints sum of number where amount of terms input user*/

public class Task5Add {
	public static void main(String [] args){
		System.out.println("Введите целое число: ");    // print message
		Scanner sc= new Scanner(System.in);				//create object of the class Scanner
		int num=sc.nextInt();							//get amount of terms
		int sum=0;										// variable sum of numbers
		for(int i=0;i<=num;i++){						//cycle for calculation sum of numbers		
			sum+=i;										//addition to variable sum of numbers next number
		}
		System.out.println("Сумма равна "+ sum);		//print message with sum of numbers 
	}
}
