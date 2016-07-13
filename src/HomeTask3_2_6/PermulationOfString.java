package HomeTask3_2_6;

import java.util.Arrays;
import java.util.Scanner;

/**Class checks that second string input user is permutation first string input
 * and print message about this  */

public class PermulationOfString {
	public static void isStrings(String str1,String str2){		//method checks strings: permute or not
		char[] arrayOfFirstString=new char[str1.length()];		//create array of symbols of first string
		char[] arrayOfSecondString=new char[str2.length()];		//create array of symbols of second string 
		str1.getChars(0, str1.length(), arrayOfFirstString, 0);	//fill array of symbols of first string
		str2.getChars(0, str2.length(), arrayOfSecondString,0);	//fill array of symbols of second string
		if(str1.length()==str2.length()){						//check lengths of strings 
			for (int i=0;i<str1.length();i++){					//cycle passage array of symbols of first string
				arrayOfFirstString[i]=Character.toLowerCase(arrayOfFirstString[i]);	//adduce symbol to lower case
			}
			for(int i=0;i<str2.length();i++){					//cycle passage array of symbols of second string
				arrayOfSecondString[i]=Character.toLowerCase(arrayOfSecondString[i]);//adduce symbol to lower case
			}
			Arrays.sort(arrayOfFirstString);	//sort array of symbols of first string
			Arrays.sort(arrayOfSecondString);	//sort array of symbols of second string
			int count=0;						//set count coincidences 
			for(int i=0;i<str1.length();i++){	//cycle passage arrays of symbols of first string and second string 
				if(arrayOfFirstString[i]==arrayOfSecondString[i]){	// coincide symbols from arrays of symbols of 1 and 2 strings 
					count++;					//add count coincidences
				}
			}
			if(count==str1.length()){	//check count coincidences and length of arrays of symbols of 1 and  2 strings
				System.out.printf("Строка \"%s\" является перестановкой строки \"%s\"",
						str2,str1);    //print message
			}else{
				System.out.printf("Строка \"%s\" не является перестановкой строки \"%s\","
						,str2,str1); //print message
			}
		}else{
			System.out.printf("Строка \"%s\" не является перестановкой строки \"%s\","
					,str2,str1); //print message
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);						//create object scan input user values
		String inputFirstString, inputSecondString;				//variable 1 input string and variable 2 input string 
		System.out.println("Введите первую строку:");			//print message
		inputFirstString=sc.nextLine();							//get 1 string
		System.out.println("Введите вторую строку:");			//print message
		inputSecondString=sc.nextLine();						//get 2 string
		PermulationOfString.isStrings(inputFirstString, inputSecondString); // call method check permutation string
	}

}
