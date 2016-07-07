package HomeTask2Add_1;

import java.util.Scanner;

/** Class defines day of week based on date*/

public class Task1Add {
	public static void main (String [] args){
		int day;                                   //variable of day
		System.out.println("Введите день месяца:");//print message
		Scanner sc= new Scanner(System.in);        //create object of the class Scanner
		int numDay = sc.nextInt();                 // get number day of month
		System.out.println("Введите номер месяца:");//print message
		int month=sc.nextInt();                    //get number month
		System.out.println("Введите год:");        //print message
		int year=sc.nextInt();					   //get number year
		if(month==1 || month==2){				   // condition for January and February
			month+=10;							   // add to numbers  January and February 10
		} else{									   //condition for others months
			month-=2;							   //subtraction from number month 2
		}
		day = (numDay+(1*(13*month-1)/5)+year%100+(year%100)/4+(year/100)/4-2*(year/100)+777)%7;//calculate day of week
		switch (day){							   //transfer in switch operator number of day
			case 0:{							   //instructions for value of number day "0"
				System.out.println("Воскресенье"); //print message
				break;							   //break switch operator
			}
			case 1:{							   //instructions for value of day of week "1"
				System.out.println("Понедельник"); //print message
				break;							   //break  switch operator
			}
			case 2:{							   //instructions for value of day of week "2"
				System.out.println("Вторник");     //print message
				break;							   //break operator switch
			}
			case 3:{							   //instructions for value of day of week "3"
				System.out.println("Среда");       //print message
				break;                             //break operator switch
			}
			case 4:{                               //instructions for value of day of week "4"
				System.out.println("Четверг");     //print message
				break;                             //break operator switch
			}
			case 5:{                               //instructions for value of day of week "5"
				System.out.println("Пятница");     //print message
				break;                             //break operator switch
			}
			case 6:{                               //instructions for value of day of week "6"
				System.out.println("Суббота");     //print message
				break;                             //break operator switch
			}
		}
		
	}
}
