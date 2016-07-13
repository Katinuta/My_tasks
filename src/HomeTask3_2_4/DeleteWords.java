package HomeTask3_2_4;

import java.util.Scanner;

/**Class deletes from text words where count of letter equally input user number and begin on
 * consonant letters*/

public class DeleteWords {

	public static void main(String[] args) {
		String text=new String("ЕКак ёвидно из примера, сравниваться 2могут и значения, записанные "
				+ "непосредственно в тексте, программы и находящиеся "
				+ "в переменных, и результаты выражений.");	//variable of text
		System.out.println("Введите количество символов в слове: ");	//print message
		String[] arrayOfWords=text.split(" ");			//get array of words from text
		Scanner sc=new Scanner(System.in);				//create object scan input user value
		int k=sc.nextInt();								//variable number count of letter in word
		for(int i=0;i<arrayOfWords.length;i++){			//cycle passage array of words of text
			String str=arrayOfWords[i];					//get element of array
			if((Character.isLetter(str.charAt(0)))){	//check symbol on letter
				if(Character.toLowerCase(str.charAt(0))== 'а'||	Character.toLowerCase(str.charAt(0))=='у'
					||Character.toLowerCase(str.charAt(0))=='о'|| Character.toLowerCase(str.charAt(0))=='ы'
					|| Character.toLowerCase(str.charAt(0))=='и'|| Character.toLowerCase(str.charAt(0))=='и'
					|| Character.toLowerCase(str.charAt(0))=='э'|| Character.toLowerCase(str.charAt(0))=='я'
					|| Character.toLowerCase(str.charAt(0))=='ю'|| Character.toLowerCase(str.charAt(0))=='ё'
					|| Character.toLowerCase(str.charAt(0))=='е'){ //  exceptions letter begin on vowel
					System.out.print(str +" "); //print string
				}else{
					if(str.length()!=k){        // condition include words for print
							if(str.length()==k+1){	//condition  for print words 
								if(str.endsWith(".")||str.endsWith(",")){
									//condition exceptions for print words end on "," "." 
									System.out.print(str.charAt(str.length()-1)+" ");  //print "," "."
									continue;
								}
							}
							System.out.print(str+" ");  //print word
							
						}else{
							if(str.endsWith(".")||str.endsWith(",")){ 
								//condition include words for print  words end on "," "." 
								System.out.print(str+" ");//print word
							}
						}
						if(i%10==0&&i!=0){          //condition formatting print  
							System.out.println(""); // line translation
						}
				}
			}else{
				System.out.print(str+ " "); //print word
			}
			
		}
	}
}
