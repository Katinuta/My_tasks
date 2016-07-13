package HomeTask3_2_8;

import java.util.Scanner;

/**Class changes in  input user matrix where element of matrix is null
 * all elements of this row and column on null */

public class MatrixWithNull {

	public static void main(String[] args) {
		System.out.print("Введите количество строк матрицы:");   //print message
		Scanner sc =new Scanner(System.in);					     //create object scan input user value
		int rows=sc.nextInt();									 //get count of rows in the matrix
		System.out.print("Введите количество столбцов:");		 //print message
		int columns=sc.nextInt();								 //get count of columns in the matrix
		int[][] matrix=new int[rows][columns]; 			 		 //create array of primary matrix
		int [][] matrixWithNull=new int[rows][columns];			 //create array of change matrix
		for(int i=0;i<rows;i++){								 //cycle passage of rows of the primary matrix
			System.out.printf("%-8s%-9s%-3d%-8s%n","Введите","значения",i+1,"строки");	//print message
			for(int j=0;j<columns;j++){							 //cycle passage of elements of row of the primary matrix
				System.out.printf("%-8s%-3d%-8s%-8s","Введите",j+1,"элемент","строки:");	//print message
				matrix[i][j]=sc.nextInt();						 //get value of element  of the primary matrix 
			}
		}
		System.out.println("\nВведенная матрица:");				 //print message
		for(int i=0;i<rows;i++){								 //cycle passage of rows of the primary matrix
			System.out.println("");								 //print empty string
			for(int j=0;j<columns;j++){							 //cycle passage of elements of row of the primary matrix
				System.out.printf("%-5d",matrix[i][j]);			 //print element of the primary matrix
			}
		}
		for(int i=0;i<rows;i++){								 //cycle passage of rows of primary and change matrixes
			for(int j=0;j<columns;j++){							 //cycle passage of elements of rows of primary and change matrixes
				matrixWithNull[i][j]=matrix[i][j];				 //overwrite element of the primary matrix in change matrix	
			}
		}
		for(int i=0;i<rows;i++){						//cycle passage of rows of primary and change matrixes
			for(int j=0;j<columns;j++){					//cycle passage of elements of rows of primary and change matrixes
				if(matrix[i][j]==0){					//get null element of the primary matrix 
					int entranceI=i;					//remember entrance value variable i 
					int entranceJ=j;					//remember entrance value variable j
					j=0;								//set null value for i
					i=0;								//set null value for j
					for(int k=entranceI;j<columns;j++){	//cycle passage row where is element with value null
						matrixWithNull[k][j]=0;			//set null in all elements of row in the change matrix
					}
					for(int n=entranceJ;i<rows;i++){	//cycle passage column where is element with value null
						matrixWithNull[i][n]=0;			//set null in all elements of column  in the change matrix
					}
					i=entranceI;						//return entrance value i;
					j=entranceJ;						//return entrance value j;
				}
			}
		}
		System.out.println("\n\nИзмененная матрица:\n"); //print message
		for(int i=0;i<rows;i++){						//cycle passage of rows of the change matrix
			System.out.println("");						//print empty string
			for(int j=0;j<columns;j++){					//cycle passage elements of rows of the change matrix
				System.out.printf("%-5d",matrixWithNull[i][j]); //print element of the change matrix
			}
		}
		
	}

}
