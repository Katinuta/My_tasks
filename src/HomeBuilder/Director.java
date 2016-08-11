package HomeBuilder;

/** Class calls methods for build fields of object of class Dinner */

public class Director {
	BaseBuilder builder;

	void setBaseBuilder(BaseBuilder builder) {
		this.builder = builder;
	}

	Dinner buildDinner() {
		builder.buildAddDish();
		builder.buildFirstDish();
		builder.buildDrink();
		builder.buildSecondDish();
		builder.buildDesert();
		Dinner dinner = builder.getDinner();
		return dinner; // return need dinner
	}
}
