package HomeBuilder;

/**
 * Class conatins abstarct methods for build object of class Dinner and field
 * object of class Dinner
 */

public abstract class BaseBuilder {
	protected Dinner dinner = new Dinner();

	public Dinner getDinner() {
		return dinner;
	}

	public abstract void buildFirstDish();

	public abstract void buildSecondDish();

	public abstract void buildDesert();

	public abstract void buildDrink();

	public abstract void buildAddDish();
}
