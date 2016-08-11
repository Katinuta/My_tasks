package HomeBuilder;

/**
 * Main class creates object of class Director for get need object of class
 * Dinner by type of builder
 */

public class MainDinner {

	public static void main(String[] args) {
		Director director = new Director();
		director.setBaseBuilder(new StandartDinnerBuilder());
		Dinner dinnerStandart = director.buildDinner(); // build fields by
														// StandartDinnerBuilder
		System.out.println("Standart dinner");
		System.out.println(dinnerStandart.toString());
		System.out.println("");
		director.setBaseBuilder(new LightDinnerBuilder());
		Dinner dinnerLight = director.buildDinner();// build fields by
													// LightDinnerBuilder
		System.out.println("Light dinner");
		System.out.println(dinnerLight.toString());
		System.out.println("");
		director.setBaseBuilder(new FullDinnerBuilder());
		Dinner dinnerFull = director.buildDinner();// build fields by
													// FullDinnerBuilder
		System.out.println("Full dinner");
		System.out.println(dinnerFull.toString());
		System.out.println("");
		director.setBaseBuilder(new ItalianDinnerBuilder());
		Dinner dinnerItalian = director.buildDinner();// build fields by
														// ItalianDinnerBuilder
		System.out.println("Italian dinner");
		System.out.println(dinnerItalian.toString());
		System.out.println("");
		director.setBaseBuilder(new ChangeStandartDinnerBuilder());// build
																	// fields by
																	// ItalianDinnerBuilder
		Dinner dinnerChangeStandart = director.buildDinner();
		System.out.println("Change standart dinner");
		System.out.println(dinnerChangeStandart.toString());
	}
}
