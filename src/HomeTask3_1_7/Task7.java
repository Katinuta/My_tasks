package HomeTask3_1_7;

import java.util.Scanner;

/**Class creates and fills array input user values and calculates sum values of 
 * elements of array till 0 */

public class Task7 {

	public static void main(String[] args) {
		int[] array=new int[10];		//create array
		int sumElements=0;				//set sum values of elements of array
		Scanner sc=new Scanner(System.in);  //create object for scan input user values
		for(int i=0;i<10;i++){
		System.out.printf("%-9s%-3d%-9s%-9s","Введите",(i+1),"элемент","массива:");     //print message
			if(sc.hasNextInt()){			//check input value
				array[i]=sc.nextInt();		//get value element
			}
		}
		System.out.printf("%-19s","Введенный массив:");	 //print message
		for(int i:array){						//cycle passage elements of array
			System.out.printf("%-7d",i);		//print element of array
			
		}
		for(int i:array){					//cycle passage elements of array
			if(i!=0){					    //condition get sum values of elements of array
				sumElements+=i;				//add value of element
			}else{
				break;						//break calculate
			}
		}
		System.out.printf("%n%-40s%6d","Сумма элементов массива до первого нуля:", sumElements);  
		//print sum values of elements till 0 
	}
}
