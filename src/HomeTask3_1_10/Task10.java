package HomeTask3_1_10;

import java.util.Scanner;

/**Class creates,fills, prints array NxN where "n" input user.Also it finds and prints main and averse
 * diagonals of this array*/

public class Task10 {

	public static void main(String[] args) {
		int n=0;												//variable size of array
		System.out.printf("%-25s","Введите размер матрицы:");	//print message
		Scanner sc=new Scanner(System.in);						//create object for scan input user values
		if(sc.hasNextInt()){									//check input 
			n=sc.nextInt();										//get size of array
		}else{
			System.out.printf("%s%n%s","Неверно введен размер матрицы!","Начните заново."); //print message
		} 
		int[][]array=new int[n][n];								//create array input user dimension
		for(int i=0;i<n;i++){									//cycle passage string array
			System.out.printf("%-8s%-3d%-7s%-9s%n","Введите",(i+1), "строку","матрицы"); //print message
			for(int j=0;j<n;j++){								//cycle passage elements of strings of array
				System.out.printf("%-8s%-3d%-8s%-9s","Введите",(j+1),"элемент","строки:"); // print message
				array[i][j]=sc.nextInt();						//get element of array
			}
		}
		System.out.printf("%n%s%n","Введенная матрица:");		//print message
		for(int i=0;i<n;i++){									//cycle passage string array
			for(int j=0;j<n;j++){								//cycle passage elements of strings of array
				System.out.printf("%-5d",array[i][j]);			//print element of array
			}
			System.out.print("\n");								
		}
		int[] mainDiagonal=new int[n];				//create array with elements of main diagonal of elementary array
		int[] adverseDiagonal=new int[n]; 			//create array with elements of adverse diagonal of elementary array
		int countElementsMain=0,countElementsAdverse=0; //set count of elements of arrays main and adverse diagonals 
		for(int i=0;i<n;i++){									//cycle passage string array
			for(int j=0;j<n;j++){								//cycle passage elements of strings of array
				if(i==j){										//condition main diagonal 
					mainDiagonal[countElementsMain]=array[i][j];//get element of array main diagonal
					countElementsMain++;						//increase size of array main diagonal
				}
			}
		}
		for(int i=n;i>=0;i--){									//cycle passage string array
			for(int j=0;j<n;j++){								//cycle passage elements of strings of array
				if(i+j==n-1){									//condition averse diagonal
					adverseDiagonal[countElementsAdverse]=array[i][j];//get element of array averse diagonal
					countElementsAdverse++;						//increase size of array averse diagonal
				}
			}
		}
		System.out.printf("%-29s","Элементы главной диагонали:"); //print message
		for(int i:mainDiagonal){								//cycle passage elements of main diagonal
			System.out.printf("%-5d",i);						//print element of array
		}
		System.out.printf("%n%-29s","Элементы побочной диагонали:"); //print message
		for(int i:adverseDiagonal){								//cycle passage elements averse diagonal
			System.out.printf("%-5d",i);						//print element of array
		}
	}
}
