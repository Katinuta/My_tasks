package HomeTask3_2_9;

import java.util.Scanner;

/**Class determines cyclic shift 1 string is 2 string. Strings input user */

public class CycleShiftSustring {
	public static void IsSubsting(String str1,String str2){			//method define cyclic shift 1 string
		if(str2.length()<=str1.length()){							//exception if 2 string more than 1 string
			String stringSymbols=str1+str1;							//cycle repeat of symbols
			if(stringSymbols.indexOf(str2)!=-1&&str1.indexOf(str2)==-1){	//condition cyclic shift
				System.out.printf("Строка \"%s\" получена циклическим сдвигом "  //print message
						+ "строки \"%s\".",str2,str1);
			} else if(str1.indexOf(str2)!=-1){						//condition spent string 2 in string 1
				System.out.printf("Строка \"%s\" не получена циклическим сдвигом " //print message
						+ "строки \"%s\", но является подстрокой",str2,str1);
			}else{
				System.out.printf("Строка \"%s\" не получена циклическим сдвигом "//print message
						+ "строки \"%s\", не является подстрокой.",str2,str1);
			}
		}else{
			System.out.printf("Строка \"%s\" не может являться подстрокой строки \"%s\".",str2,str1); //print message
		}
	}
	public static void main(String[] args) {
		System.out.println("Введите первую строку:"); //print message
		Scanner sc=new Scanner(System.in);            //create object scan input user values
		String StringFirst=sc.nextLine();			  //get 1 string
		System.out.println("Введите вторую строку:"); //print message
		String StringSecond=sc.nextLine();			  //get 2 string
		IsSubsting(StringFirst, StringSecond);    	  //call method IsSubsting
	}
}
