package HomeTask3_2_3;

import java.util.Scanner;

/**Class deletes all symbols besides letters and spaces in the text input user */

public class DeleteSymbols {

	public static void main(String[] args) {
		System.out.println("Введите текст: ");  					//print message
		Scanner sc =new Scanner(System.in);                         //create object scan input user string
		StringBuffer textPrimary=new StringBuffer(sc.nextLine());   //get input user string
		System.out.println("Текст обработан:");	                    //print message
		for(int i=0;i<textPrimary.length();i++){					//cycle passage of elements of input string 
			//condition  exception letters and spaces
			if(Character.isLetter((textPrimary.charAt(i)))||textPrimary.charAt(i)==' '){
				System.out.print(textPrimary.charAt(i));			//print  letters and spaces
			}
			else{
				textPrimary.deleteCharAt(i);						//delete others symbols
					i--;											//decrease index
			}
			
		}
		
	}

}
