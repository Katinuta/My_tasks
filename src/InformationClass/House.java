package InformationClass;

/**Class contains fields of class with information about houses and constructors for 
 * initialization objects of class, methods access to fields of class,
 * overridden methods hashCode(), toString(), equals() */

public class House {
	private int id,floor,lifeTime;
	private int numberOfApartment,numberOfRooms;
	private double area;
	private String street,typeOfBuilding;
	static int count=0;						//variable count of number object type of House
	public House(){							//constructor without parameters	
		count++;							//add variable count of number object type of House
	};
	public House(int id,int numberOfApartament,double area){ // constructor with parameters
		this.setId(id);
		this.setNumberOfApartment(numberOfApartament);
		this.setArea(area);
		count++;							//add variable count of number object type of House
	}
	public House(int id,int numberOfApartament, int numberRooms){   //constructor with parameters
		this.setId(id);
		this.setNumberOfApartment(numberOfApartament);
		this.setNumberOfRooms(numberRooms);
		count++;							//add variable count of number object type of House
	}
	//Methods getting and setting for fields of class
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumberOfApartment() {
		return numberOfApartment;
	}
	public void setNumberOfApartment(int numberOfApartment) {
		this.numberOfApartment = numberOfApartment;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getTypeOfBuilding() {
		return typeOfBuilding;
	}
	public void setTypeOfBuilding(String typeOfBuilding) {
		this.typeOfBuilding = typeOfBuilding;
	}
	public int getLifeTime() {
		return lifeTime;
	}
	public void setLifeTime(int lifeTime) {
		this.lifeTime = lifeTime;
	}
	//Overridden methods toString() for class House
	@Override
	public String toString(){
		return"House id- "+id+"  "+"Номер квартиры:"+numberOfApartment+"  "+"Площадь:"+area+"  "+ "Этаж:"+ floor+"  "+
				"Количество комнат:"+ numberOfRooms+"  "+"Улица:"+ street+"  "+"Тип здания:"+typeOfBuilding+"  "+
				"Срок эксплуатации:"+lifeTime;
	}
	//Overridden methods hashCode() for class House
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + floor;
		result = prime * result + id;
		result = prime * result + lifeTime;
		result = prime * result + numberOfApartment;
		result = prime * result + numberOfRooms;
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((typeOfBuilding == null) ? 0 : typeOfBuilding.hashCode());
		return result;
	}
	//Overridden methods equals() for class House
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House other = (House) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (floor != other.floor)
			return false;
		if (id != other.id)
			return false;
		if (lifeTime != other.lifeTime)
			return false;
		if (numberOfApartment != other.numberOfApartment)
			return false;
		if (numberOfRooms != other.numberOfRooms)
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (typeOfBuilding == null) {
			if (other.typeOfBuilding != null)
				return false;
		} else if (!typeOfBuilding.equals(other.typeOfBuilding))
			return false;
		return true;
	}
	
}
