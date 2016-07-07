package HomeTask2Add_7;

import java.util.Scanner;

/**Class of calculator which can add and divide input user numbers*/

public class Task7Add {

	public static void main(String[] args) {
			
		while(true){														//cycle endless
			Scanner sc=new Scanner(System.in);
			System.out.println("Выберите операцию и введите ее номер :\n"	//print menu
					+ "1.Сложение \n"+"2.Деление\n"+"q- Выход\n");
			String oper2="";												//variable letter of operation
			int oper1=0;													//variable number of operation
			if(sc.hasNextInt()){											//instruction if value of variable of operation is number
				oper1=sc.nextInt();											//get number of operation input user
			}else{															//instruction if value of variable of operation isn't number
				oper2=sc.nextLine();										//get letter of operation input user
			}
			if(oper2.equals("q")){											//condition break calculator
				break;														//break calculator
			}
			if(oper1==1||oper1==2){											//instructions if value of variable of operation  number
				System.out.println("Введите 1-ое число: ");					// print message
				int a=sc.nextInt();											//get 1 number  
				System.out.println("Введите 2-ое число: ");					//print message
				int b=sc.nextInt();											//get 2 number
				switch(oper1){												//transfer to operator switch value of operation
					case 1:{												//instructions for value of variable of operation "1"
						int c=a+b;											// operation of	addition		
						System.out.println(c);								//print result of operation
						break;												//break operator switch
					}
					case 2:{												//instructions for value of variable of operation "2"
						double c=(double)a/b;								//operation division
						if(Double.isInfinite(c)){							//condition exception error division by 0
							System.out.println("Ошибка: Деление на 0 невозможно!"); //print message
						}else{
							System.out.println("Результат "+c);             //print result of operation
						}
						break;												//break operator switch
					}
				}
			}
		}
	}
}
