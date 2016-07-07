package HomeTask2Add_3;

import java.util.Scanner;

/**Class calculates factorial of number input user */

public class Task3Add {
	public static void main(String [] args){
		System.out.println("Введите целое число: ");          //print message
		Scanner sc= new Scanner(System.in);                   //create object of the class Scanner
		int num=sc.nextInt();                                 //get number 
		int fact=1;											  //variable of factorial 
		for(int i=1;i<=num;i++){							  //cycle calculate	factorial of input number
			fact*=i;										  //formula calculation factorial
		}
		System.out.println("Факториал "+num+ " равен "+ fact); // print message with value factorial of input number
	}
}
