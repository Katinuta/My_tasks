package HomeTask3_1_2;

/**Class find maximum and minimum values in the array*/

public class Task2 {

	public static void main(String[] args) {
		int[] array={10,99,66,-3,7,8,147,45,11,2}; //create array
		int max=array[0];						   //set first maximum value
		int min=array[0];						   //set first minimum value
		for(int i=0;i<10;i++){					   //cycle for passage the elements of the array
			if(max<array[i]){					   //condition definition maximum value from the elements
				max=array[i];                      //get maximum value of element
			}
		}
		for(int i=0;i<10;i++){					   //cycle for passage the elements of the array
			if(min>array[i]){					   //condition definition minimum value from the elements
				min=array[i];					   //get minimum value of element
			}
		}
		System.out.println("max value = " + max);  //print message with maximum value from the elements
		System.out.println("min value = " + min);  //print message with minimum value from the elements
	}
}
