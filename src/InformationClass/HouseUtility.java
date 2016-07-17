package InformationClass;

/**Class contains method of creature and initialization objects of class House  and creature of array of 
 * objects of class House also methods of processing of information about houses*/

public class HouseUtility {
	
	//method of creature and initialization of objects of class House and creature of array of objects of class
	public House[] start(){
		House  house_1 =new House();
		house_1.setId(1);
		house_1.setNumberOfApartment(40);
		house_1.setArea(64.5);
		house_1.setFloor(4);
		house_1.setNumberOfRooms(2);
		house_1.setStreet("Aladovyh");
		house_1.setTypeOfBuilding("panel");
		house_1.setLifeTime(10);
		House house_2=new House(2,41,39.4);
		house_2.setFloor(4);
		house_2.setNumberOfRooms(1);
		house_2.setStreet("Aladovyh");
		house_2.setTypeOfBuilding("panel");
		house_2.setLifeTime(10);
		House house_3=new House(3,42,3);
		house_3.setArea(91.3);
		house_3.setFloor(4);
		house_3.setStreet("Aladovyh");
		house_3.setTypeOfBuilding("panel");
		house_3.setLifeTime(10);
		House house_4=new House(4,39,60.1);
		house_4.setFloor(4);
		house_4.setNumberOfRooms(2);
		house_4.setStreet("Aladovyh");
		house_4.setTypeOfBuilding("panel");
		house_4.setLifeTime(10);
		House house_5=new House(5,44,1);
		house_5.setArea(60.1);
		house_5.setFloor(5);
		house_5.setStreet("Aladovyh");
		house_5.setTypeOfBuilding("panel");
		house_5.setLifeTime(10);
		House  house_6 =new House();
		house_6.setId(6);
		house_6.setNumberOfApartment(45);
		house_6.setArea(104.8);
		house_6.setFloor(5);
		house_6.setNumberOfRooms(3);
		house_6.setStreet("Aladovyh");
		house_6.setTypeOfBuilding("panel");
		house_6.setLifeTime(10);
		House house_7=new House(7,46,69.6);
		house_7.setFloor(5);
		house_7.setNumberOfRooms(2);
		house_7.setStreet("Aladovyh");
		house_7.setTypeOfBuilding("panel");
		house_7.setLifeTime(10);
		House house_8=new House(8,48,40.3);
		house_8.setFloor(6);
		house_8.setNumberOfRooms(1);
		house_8.setStreet("Aladovyh");
		house_8.setTypeOfBuilding("panel");
		house_8.setLifeTime(10);
		House house_9=new House(9,49,101.2);
		house_9.setFloor(6);
		house_9.setNumberOfRooms(3);
		house_9.setStreet("Aladovyh");
		house_9.setTypeOfBuilding("panel");
		house_9.setLifeTime(10);
		House house_10=new House(10,50,67.8);
		house_10.setFloor(6);
		house_10.setNumberOfRooms(2);
		house_10.setStreet("Aladovyh");
		house_10.setTypeOfBuilding("panel");
		house_10.setLifeTime(10);
		House[] arrayOfHouse=new House[House.count]; //create array of objects of class House
		arrayOfHouse[0]=house_1;
		arrayOfHouse[1]=house_2;
		arrayOfHouse[2]=house_3;
		arrayOfHouse[3]=house_4;
		arrayOfHouse[4]=house_5;
		arrayOfHouse[5]=house_6;
		arrayOfHouse[6]=house_7;
		arrayOfHouse[7]=house_8;
		arrayOfHouse[8]=house_9;
		arrayOfHouse[9]=house_10;
		return arrayOfHouse;
	}
	/*method selects and prints of list of objects with value of number of rooms equal input user
	 *  number from array of objects of class House*/
	public void getListOfRooms(House[]house,int rooms){
		for(int i=0;i<House.count;i++){
			int numberOfRooms=(house[i]).getNumberOfRooms();
			if(numberOfRooms==rooms){
				System.out.println((house[i]).toString());
			}
		}
	}
	/*method selects and prints of list of objects with value of number of rooms equal number 
	 * input user in range floors input user from array of objects of class House*/
	public void getListOfRoomsAndFloors(House[] house,int rooms,int beginFloor,int endFloor){
		for(int i=0;i<House.count;i++){
			int numberOfRooms=(house[i]).getNumberOfRooms();
			int floor=(house[i]).getFloor();
			if(numberOfRooms==rooms&&beginFloor<=floor&&endFloor>=floor){
				System.out.println((house[i]).toString());
			}
		}
	}
	/*method selects and prints of list of objects with value of area of apartment more 
	 * then input user value*/
	public void getListOfArea(House[] house, double square){
		for(int i=0;i<House.count;i++){
			double area=(house[i]).getArea();
			if(area>square){
				System.out.println((house[i]).toString());
			}
		}
	}
}
