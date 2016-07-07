package HomeTask2_6;

import java.util.Scanner;

/**Class adds to numbers word "рубль"  in the correct case*/

public class Task6 {
	public static void main(String [] args){
		System.out.print("Введите число от 1 до 999 :");//print message
		Scanner sc = new Scanner(System.in);//create object of the class Scanner
		int number = sc.nextInt();//get input user number 
		switch(number%10){//get remainder of the division
			case 1:{// instructions for value "1" of the remainder of the division
				System.out.println( number+ " рубль");//print message
				break;// break operator switch
			}
			case 2:
			case 3:
			case 4:{//instructions for value "2","3","4" of the remainder of the division
				System.out.println( number+ " рубля");// print message
				break;//break operator switch
			}
			default:{//instructions for others value of the remainder of the division
				System.out.println( number+ " рублей");//print message
			}
			
		}
	}
}
