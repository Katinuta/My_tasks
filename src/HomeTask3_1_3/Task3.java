package HomeTask3_1_3;

import java.util.Scanner;
import java.math.*;

/**Class creates arrays different ways and prints this*/

public class Task3 {

	public static void main(String[] args) {
		System.out.println("Создание массива списком инициализации\n");          //print message
		int[] array1={47,122,4,11,2,8,75,66,33,5251,18,1,-77,41,85};			 //create array
		System.out.printf("%-30s", "Массив, созданный списком инициализации: "); //print message
		for(int i=0;i<15;i++){													 //cycle passage elements of array
			System.out.printf("%-5d",array1[i]);								 //print element array						
		}
		int[]array2=new int[15];												 //create array
		System.out.println("\n\nСоздание массива вводом с клавиатуры\n");        //print message
		System.out.println("Вводите только целые числа!!!!");					 //print message
		Scanner sc=new Scanner(System.in);										 //create object of the class Scanner 
		for(int i=0;i<15;i++){													 //cycle passage elements of array						
			System.out.printf("%-9s%-3d%4s%9s ","Введите",(i+1),"элемент","массива:"); //print message
			if(sc.hasNextInt()){												 //check input value
			array2[i]=sc.nextInt();												 //get value of element of array
			}
		}
		System.out.printf("%-30s","Массив, созданный вводом с клавиатуры:");	 //print message
		for(int i=0;i<15;i++){													 //cycle passage elements of array
			System.out.printf("%5d",array2[i]);									 //print element of array
		}
		double[]array3=new double[15];											 //create array
		System.out.println("\n\nCозданние массива случайным образом \n");		 //print message
		System.out.printf("%-30s","Массив,созданный случайным образом:");		 //print message
		for(double d:array3){													 //cycle passage elements of array
			d=(Math.random()*10+1);												 //get random value of element of array
			System.out.printf("%-6.2f",d);										 //print element of array				
		}
	}
}
