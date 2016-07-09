package HomeTask3_1_6;

import java.util.Scanner;

public class Task6 {
 
	public static void main(String[] args) {
		int[] array=new int[10];			//create array
		int count=0;						//set count negative elements of array
		Scanner sc=new Scanner(System.in);	//create object for scan input user value
		for(int i=0;i<10;i++){				//cycle passage elements of array
			System.out.printf("%-9s%-3d%-8s%s","Введите",(i+1),"элемент","массива:"); //print message
			if(sc.hasNextInt()){				//check input user value
				array[i]=sc.nextInt();			//get value element of array
			}
		}
		System.out.printf("%-19s","Введенный массив:"); //print message
		for(int i:array){				 //cycle passage elements of array	
			System.out.printf("%-7d",i); //print elements of array
			if(i<0){				     //condition negativity elements
				count+=1;			     //count negative elements
			}
		}
		System.out.printf("%n%-37s%d","Количество отрицательных элементов:",count);  //print count negative elements in array
	}
}
