package HomeTask2Add_6;

import static java.lang.Math.*;

/**Class calculates values of  the function in range from -4 to 4*/

public class Task6Add {
	public static void main(String[] agrs){
		double y;							//variable value of function
		for(double i=-4.0;i<=4.0;i+=0.5){	//cycle for calculation and printing values of function in range from -4 to 4
			y=2*pow(i,2)-5*i-8;				//calculate value of function
			System.out.println(i+ "  " +y); // print message with value of function
		}
	}
}
