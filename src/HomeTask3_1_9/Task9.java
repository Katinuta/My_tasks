package HomeTask3_1_9;

import java.util.Scanner;

/**Class creates, fills  array input user value and sorts array with 0*/

public class Task9 {
	
	public static void main(String[] args){
		int[] array= new int[10];						//create array
		Scanner sc=new Scanner(System.in);				//create object for scan input user values
		for(int i=0;i<10;i++){							//cycle for passage elements of array
			System.out.printf("%-8s%-3d%-8s%-9s","Введите",(i+1),"элемент","массива:");	//print message
			if(sc.hasNextInt()){						//check input user value
				array[i]=sc.nextInt();					//get input value element of array
			}else{
				System.out.println("Ошибка ввода");		//message error
			}
		}
		System.out.printf("%-24s","Введенный массив:"); //print message
		for(int i:array){								//cycle passage elements of array
			System.out.printf("%-7d",i);				//print element of array
		}
		for(int i=9;i>=0;i--){							//cycle passage elements of array from the end
			if(array[i]==0){							//condition if value of element 0
				if(i!=9){								//exclude last element of array
					for(int j=i;j<9;j++){				//cycle passage elements of array
						int value=array[j];				//get current value of element of array
						array[j]=array[j+1];			//change current value on value of next element
						array[j+1]=value;				//change next value of element on value of current element
					}
				}
			}
		}
		System.out.printf("%n%-24s","Массив с перестановкой:");		//print message
		for(int i:array){								//cycle passage elements of array
			System.out.printf("%-7d",i);				//print element of array
		}
	} 
}
