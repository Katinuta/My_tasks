package HomeTask3_1_8;

import java.util.Scanner;

/**Class creates ,initializes array where values input user and calculates 
 * multiplication values of elements of array till first 0*/

public class Task8 {

	public static void main(String[] args) {
		int[]array =new int[10];				//create array
		int multElements=1;						//set result multiplication value of elements
		Scanner sc=new Scanner(System.in);		//create object for scan input user values
		for(int i=0;i<10;i++){					//cycle passage elements of array
			System.out.printf("%-8s%-3d%-9s%-9s","Введите",(i+1),"элемент","массива:"); //print message
			if(sc.hasNextInt()){				//check input user value
				array[i]=sc.nextInt();			//get value of element
			}
		}
		System.out.printf("%-19s","Введенный массив:");	  //print message
		for(int i:array){						//cycle passage elements of array
			System.out.printf("%-7d",i);		//print element array
		}
		for(int i:array){						//cycle passage elements of array
			if(i!=0){							//condition for multiplication elements of array
				multElements*=i;				//multiplication elements of array
			}else{
				break;							//break calculate
			}
		}
		System.out.printf("%n%-48s%8d","Произведение элементов массива до первого нуля:",multElements);
		//print result multiplication elements of array till first 0
	}
}
