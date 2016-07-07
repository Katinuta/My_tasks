package HomeTask2Add_4;

import  static java.lang.Math.*;

/** Class calculates square numbers from 0 to 10 and prints numbers and theirs square */

public class Task4Add {
	public static void main(String [] args){
		int num=0;									//variable square
		for(int i=0;i<=10;i++){						//cycle for calculation square and printing numbers and their square
			num=(int)pow(i,2);						//calculation square
			System.out.println(i+" - "+num + "  "); // printing message numbers and their square
		}
		
	}
}
