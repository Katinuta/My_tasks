package HomeTask3_1_5;

/**Class creates and fills array input user values also finds minimum value
 * elements array and its index */

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int[] array=new int[15];			//create array
		Scanner sc=new Scanner(System.in);	//create object of the class Scanner
		for(int i=0;i<15;i++){				//cycle passage elements of array
			System.out.printf("%-9s%-3d%4s%9s","Введите",(i+1),"элемент","массива:");//print message
			if(sc.hasNextInt()){			//check input value
				array[i]= sc.nextInt();		//get value of element of array
			}
		}
		System.out.printf("%-20s", "Введенный массив:"); // print message
		int minValue=array[0];				//set minimum value elements of array	
		int minIndex=0;						//set index element with minimum value  
		for(int i =0;i<15;i++){				//cycle passage elements of array
			System.out.printf("%-7d",array[i]);	//print element of array
			if(minValue>array[i]){			//condition get minimum value from elements array
				minValue=array[i];			//get element with minimum value
				minIndex=i;					//get index element with minimum value
			}
		}
		System.out.printf("%n%-42s%13d","Минимальное значение из элементов массива:", minValue);
		//print minimum value from elements array
		System.out.printf("%n%-38s%4d","Индекс минимального значения:",minIndex);
		//print index element with minimum value
	}
}
