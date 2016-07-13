package HomeTask3_2_5;

import java.util.Scanner;

public class SymbolInText {

	public static void main(String[] args) {
		String text= new String();					//create variable input text
		System.out.println("Введите текст: ");		//print message
		Scanner sc=new Scanner(System.in);			//create object scan input user value
		text=sc.nextLine();							//get input text
		String textLowerCase=text.toLowerCase();	//adduce case to lower
		String symbolsOfText=new String();			//variable string of unique symbols from text
		int [] countOfSymbol=new int [text.length()]; //variable count repeat symbols
		boolean condition=false; 					//set condition to print message about
		int indexSymbolsOfText=0;					//set index for symbols from string of unique symbols
		for(int i=0;i<text.length();i++){			//cycle passage text
			char symbol =textLowerCase.charAt(i);	//extract symbol
			if(symbolsOfText.indexOf(symbol)==-1){	//condition unique symbols
				symbolsOfText+=symbol;				//add symbol to string of unique symbols
				countOfSymbol[indexSymbolsOfText]+=1; //add count repeat symbol
				indexSymbolsOfText++;				//add index for symbols from string of unique symbols
			}else{
				condition=true;						//change condition to print message about
				countOfSymbol[symbolsOfText.indexOf(symbol)]+=1; //add count repeat symbol
			}
		}
		if(condition==true){  //condition for message about repeat in the text more than 1 time 
			System.out.printf("В введенном тексте есть символы, которые "
					+ "встречаются более одного раза: %n");
			//print message about repeat more than 1 time in the text
			for(int i=0;i< text.length();i++){			//cycle passage of string of unique symbols
				if(countOfSymbol[i]>1){					//condition repeat more than 1 time
					System.out.printf("В тексте \"%s\" встречается %d раз(а)%n",symbolsOfText.charAt(i),
							countOfSymbol[i]);  //print message with symbols and  their count repeat 
					
				}
			}
		}else{
			System.out.println("Все символы в тексте встречаются один раз."); 
												//print message  about repeat 1 time in the text
		}
	
	}
}
