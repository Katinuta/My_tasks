package HomeTask3_2_1;

import java.util.Scanner;

/**Class changes input user number of letter on input user symbol
 * in all words if length this number */

public class ChangeLetter {

	public static void main(String[] args) {  
		//create variable text
		StringBuffer text=new StringBuffer("В параметрах метода нужно указать индекс строки,"
				+ " с которого начинается подстрока и индекс, которым заканчивается."
				+ " Также возможно указывать только начальный индекс."
				+ " В этом случае будет возвращена подстрока от начального индекса и до конца строки. ");
		
		int k;                                                  //value of number
		System.out.println("Введите порядковый номер символа:");//print message
		Scanner sc =new Scanner(System.in);						//create object scan input user value
		k=sc.nextInt();											//get number of letter
		System.out.println("Введите  заменяющий символ:");		//print message
		char []symbol =new char[(sc.nextLine()).length()];		//create array of symbol for change
		symbol= (sc.nextLine()).toCharArray();					//get array of symbol for change
		char newSymbol=symbol[0];								//symbol for change
		int index=0;											//set primary value of index
		while(index<text.length()-1){							//cycle passage text
			if(k<(text.indexOf(" ", index+1)-text.indexOf(" ",index))){ //condition define change words
				text.setCharAt(index+k, newSymbol);				//set given symbol in given position 
				index=text.indexOf(" ", index);					//set new index
			}
			index++;											//add index
		}
		System.out.printf("%s%n%s%n%s%n%s",(text.toString()).substring(0, (text.length()/4)),
				(text.toString()).substring( text.length()/4,(text.length()/4)*2),
				(text.toString()).substring( text.length()/4*2,(text.length()/4)*3),
				(text.toString()).substring( text.length()/4*3,text.length()));
		//Print change text
	}
}
