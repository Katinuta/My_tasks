package HomeTask2_1;

import java.util.Scanner;
/** Class divides input user string in half and show 2 new string */

public class Task1 {
	public static void main(String[] args){
		System.out.println("Vvedite stroku:");
		String str1,str2,str3;//str1 - entered user string,str2- first half string,str3-second half string
		int letters, part1;//letters -amount characters in string,part1- number character middle string
		Scanner sc =new Scanner(System.in); //scan user input
		str1= sc.nextLine();//get string  user input
		letters =str1.length();//get length of the string
		part1=letters/2;//divide length of the string in half
		str2=str1.substring(0, part1);//get first half the string
		System.out.println(str2);//show first half the string
		str3=str1.substring(part1);//get second half the string
		System.out.println(str3);// show second half the string
	}
	
}
