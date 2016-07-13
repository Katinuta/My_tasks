package HomeTask3_2_2;

/**Class changes letter on this number in the alphabet and prints 2 string.
 * First string - primary.Second string - numbers of letter  */

public class EnglishAlphabet {

	public static void main(String[] args) {
		String text=new String("She knew Madame Daubreuil perfectly by sight.");	//primary string
		char[] arrayText=new char[text.length()];				// create array of text
		int[] arrayNumberOfLetter= new int[text.length()];		//create array of numbers of letters
		arrayText=text.toCharArray();							//fill array of text
		int subtraction =(int)'A'-1;							//get number letter 'A'
		for(int i=0;i<text.length();i++){						//cycle passage elements of array of text
			if(Character.isLetter(arrayText[i])){				//check symbol on letter
				arrayNumberOfLetter[i]=(int)(Character.toUpperCase(arrayText[i]))-subtraction; 
				//fill array of numbers of letter
			}
		}
		for(char ch:arrayText){									//cycle passage elements of array of text		
			System.out.printf("%-3s",ch);						//print element of array
		}
		System.out.println("");									//print empty string
		for(int i:arrayNumberOfLetter){							//cycle passage elements of array of numbers of letters
			if(i==0){											//check 
				System.out.print("   ");						//print space
				continue;										//continue cycle 
			}
			System.out.printf("%-3d",i);						//print element of array numbers of letters
		}
	}
}
