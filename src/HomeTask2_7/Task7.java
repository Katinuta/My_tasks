package HomeTask2_7;

import java.util.Scanner;

/**Class prints month based on the number */

public class Task7 {
	public static void main(String[] args){
		System.out.println("Введите номер месяца:");//print message
		Scanner sc= new Scanner(System.in);//create object of the class Scanner
		int numMonth = sc.nextInt();//get number month
		switch(numMonth){//transfer in operator switch value of the number month
			case 1:{//instructions for value "1" of the number month 
				System.out.println("Январь");//print message
				break;//break operator switch
			}
			case 2:{//instructions for value "2" of the number month
				System.out.println("Февраль");//print message
				break;//break operator switch 
			}
			case 3:{//instructions for value "3" of the number month
				System.out.println("Март");//print message
				break;//break operator switch 
			}
			case 4:{//instructions for value "4" of the number month
				System.out.println("Апрель");//print message
				break;//break operator switch 
			}
			case 5:{//instructions for value "5" of the number month
				System.out.println("Май");//print message
				break;//break operator switch 
			}
			case 6:{//instructions for value "6" of the number month
				System.out.println("Июнь");//print message
				break;//break operator switch 
			}
			case 7:{//instructions for value "7" of the number month
				System.out.println("Июль");//print message
				break;//break operator switch 
			}
			case 8:{//instructions for value "8" of the number month
				System.out.println("Август");//print message
				break;//break operator switch 
			}
			case 9:{//instructions for value "9" of the number month
				System.out.println("Сентябрь");//print message
				break;//break operator switch 
			}
			case 10:{//instructions for value "10" of the number month
				System.out.println("Октябрь");//print message
				break;//break operator switch 
			}
			case 11:{//instructions for value "11" of the number month
				System.out.println("Ноябрь");//print message
				break;//break operator switch 
			}
			case 12:{//instructions for value "12" of the number month
				System.out.println("Декабрь");//print message
				break;//break operator switch 
			}
			default: {//instructions for others value of the number month
				System.out.println("Вы ввели несуществующий номер месяца");//print message
			}
		}
		
	}
}
