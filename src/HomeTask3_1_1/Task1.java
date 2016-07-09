package HomeTask3_1_1;

/**Class creates, prints array and calculates average value of members of array*/

public class Task1 {

	public static void main(String[] args) {
		float sum=0;											 //variable sum of members of array
		float[] mas={5.5f,2.2f,3.3f,4.5f,9f,7f,4.2f,2f,8f,99.9f};//initialization array
		for(int i=0;i<10;i++){									 //cycle for busting members of array 		
			System.out.printf("%-5.1f%s",mas[i],"|");					 //print array
			sum+=mas[i];										 //sum values of members of array
			if(i==9){											 //condition for calculation average value
				System.out.printf("%n%-17s%4.3f","avergate value =", (sum/9) );    //print average value
			}
		}
	}
}
