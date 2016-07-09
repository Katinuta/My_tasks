package HomeTask3_1_4;

import java.util.Scanner;

/**Class creates  fills array  values input user and finds maximum value from elements of array
 *  and index this element*/

public class Task4 {

	public static void main(String[] args) {
		int[]array= new int[15];							//create array
		Scanner sc=new Scanner(System.in);					//create object of the class Scanner	
		for(int i=0;i<15;i++){								//cycle passage elements of array						
			System.out.printf("%-9s%-3d%4s%9s ","Введите",(i+1),"элемент","массива:"); //print message
			if(sc.hasNextInt()){							//check input value
			array[i]=sc.nextInt();							//get value of element of array
			}
		}
		System.out.print("Введенный массив: ");				//print message
		int maxValue=array[0];								//set first maximum value of elements of array
		int maxIndex=0;										//set index element with maximum value
		for(int i=0;i<15;i++){								//cycle passage elements of array
			System.out.printf("%-7d",array[i]);	    	//print element of array
			if(maxValue<array[i]){							//condition get maximum value from elements of array
				maxValue=array[i];							//get maximum value of element of array
				maxIndex=i;									//get index element with maximum value 
			}
		}
		System.out.printf("%n%-42s%12d","Максимальное значение из элементов массива : ", maxValue);
		//print maximum value from elements array
		System.out.printf("%n%-38s%4d","Индекс элемента с максимальным значением: ",maxIndex);
		//print index of element with maximum value
	}
}
