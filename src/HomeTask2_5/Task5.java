package HomeTask2_5;

import java.util.Scanner;

/**Class calculates the normal weight with recommendations */

public class Task5 {
	public static void main(String [] args){
		System.out.print("Введите свой рост в сантиметрах:");// print message
		Scanner sc = new Scanner(System.in);//create object of class Scanner
		int heightUser =sc.nextInt();//get height input user
		System.out.print("Введите свой вес в килограммах:");//print message
		int weightUser =sc.nextInt();//get weight input user
		int weight = heightUser-100;//calculate normal weight
		if(weight>weightUser){//compare normal weight and user weight
			System.out.print("Вам необходимо поправиться на " + (weight-weightUser)+" кг");//print recommendation
		}
		else{
			if(weight<weightUser){//compare normal weight and user weight
				System.out.print("Вам необходимо похудеть на " + (weightUser-weight)+" кг");//print recommendation
			}
			else{
				System.out.print("Ваш вес в норме");//print message
			}
		}
	}
}
