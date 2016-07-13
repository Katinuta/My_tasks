package HomeTask3_2_7;

import java.util.Scanner;

/**Class compresses input user string and show string with minimum size */

public class StringCompression {
	public static String compression(String str){				//method compresses string
		StringBuffer textCompressed = new StringBuffer(str);	//variable text compressed 
		int countRepeat=1;										//set count repeat
		for(int i=0;i<textCompressed.length();i++){				//cycle passage elements of text compressed
			if(i!=textCompressed.length()-1){					//condition not end  of string
				char symbolCurrent=textCompressed.charAt(i);	//get current symbol	
				char symbolNext=textCompressed.charAt(i+1);		//get next symbol
				if(symbolCurrent==symbolNext){					//comparison symbols
					countRepeat+=1;								//add count of repeat
				}else{
					if(countRepeat!=1){							
						//condition for delete repeat symbols and insert of count repeat
						textCompressed.delete(i+2-countRepeat,i+1);		//delete repeat symbols
						textCompressed.insert(i-countRepeat+2, countRepeat);//insert count of repeat
						i=i-countRepeat+2;						//change index
						countRepeat=1;							//set count of repeat
					}else{
							textCompressed.insert(i+1, countRepeat);//insert count of repeat
							i++;								//add index
						
					}
				}
			}else{												//condition  end  of string
				if(countRepeat>1){			//condition for delete repeat symbols and insert of count repeat
					textCompressed.delete(i-countRepeat+2, textCompressed.length()); //delete repeat symbols
					textCompressed.append(countRepeat);   //insert count of repeat
					break;
				}else{
					textCompressed.append(countRepeat);   //insert count of repeat
					break;
				}
			}
		}
	    if((textCompressed.toString()).length()<str.length()){ //condition minimum strings
		 	return textCompressed.toString();
		}else{
			return str;
		}
	}

	public static void main(String[] args) {
		System.out.println("Введите строку, которую необходимо сжать: "); //print message
		Scanner sc=new Scanner(System.in);								 //create object scan input user value
		String text=new String();						//variable input text
		text=sc.nextLine();								//get input text
		String result=StringCompression.compression(text); 		//get result of compression
		if(result.equals(text)){						//condition  minimum size of string
			System.out.printf("Строку \"%s\" сжать нельзя.%nРезультат сжатия: \"%s\".", text, result); //print message
		}else{
			System.out.printf("Результат сжатия строки \"%s\": \"%s\"",text,result); //print message
		}
			

	}

}
