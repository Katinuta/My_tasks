package HomeBuilder;

/**
 * Class cotains override methods for build fields of class Dinner for light
 * dinner
 */

public class LightDinnerBuilder extends BaseBuilder {

	@Override
	public void buildFirstDish() {}

	@Override
	public void buildSecondDish() {
		dinner.setSecondDish(Menu.CHIKEN.toString().toLowerCase());
	}

	@Override
	public void buildDesert() {}

	@Override
	public void buildDrink() {
		dinner.setDrink(Menu.TEA.toString().toLowerCase());
	}

	@Override
	public void buildAddDish() {
		dinner.setAddDish(Menu.GREEK_SALAD.toString().toLowerCase());
	}

}
