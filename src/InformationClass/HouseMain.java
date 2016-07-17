package InformationClass;

import java.util.Scanner;

/**Class of program execution with console menu and get input user value and calling  correct method
 * from class HouseUtility. Also gets values for select of list from array Of object class House*/

public class HouseMain {

	public static void main(String[] args) {
		HouseUtility hu=new HouseUtility();
		//print console menu
		System.out.println("Выберите необходимый список:\n1.Cписок квартир,имеющих заданное число комнат\n"
				+ "2.Список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в "
				+ "заданном промежутке\n3.Список квартир, имеющих площадь, превосходящую заданную");
		Scanner sc =new Scanner(System.in);
		Scanner sc_2=new Scanner(System.in);
		int rooms,beginFloor,endFloor;
		double square;
		int action=sc.nextInt();              //get item of menu
		switch(action){						  //selection of correct method
			case 1:{
				System.out.println("Введите количество комнат от 1 до 3:");
				rooms=sc.nextInt();			  //get value of number of rooms
				/*calling method selects and prints of list of objects with value of number of rooms
				 *  equal input user  number from array of objects of class House*/
				hu.getListOfRooms(hu.start(),rooms); 
				break;
			}
			case 2:{
				System.out.println("Введите количeство комнат от 1 до 3:");
				rooms=sc.nextInt();				
				System.out.println("Введите диапозон этажей от 4 до 6");
				beginFloor=sc.nextInt();	  //get value of begin of range floors
				endFloor=sc_2.nextInt();	  //get value of end of range floors
				/* calling method selects and prints of list of objects with value of number of rooms 
				 * equal number input user in range floors input user from array of objects of 
				 * class House*/
				hu.getListOfRoomsAndFloors(hu.start(), rooms, beginFloor, endFloor);
				break;
			}
			case 3:{
				System.out.println("Введите площадь  до 104.8 м.кв.:");
				square=sc.nextDouble();			//get value of area of apartment
				/*calling method selects and prints of list of objects with value of area of apartment
				 *  more then input user value*/
				hu.getListOfArea(hu.start(), square);
				break;
			}
			default:{
				System.out.println("Списка с таким номером не существует!");
			}
		}
	}

}
