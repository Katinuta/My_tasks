package HomeBuilder;

/**
 * Class cotains override methods for build fields of class Dinner for italian
 * dinner
 */

public class ItalianDinnerBuilder extends BaseBuilder {

	@Override
	public void buildFirstDish() {
		dinner.setFirstDish(Menu.CAPRESE.toString().toLowerCase());
	}

	@Override
	public void buildSecondDish() {
		dinner.setSecondDish(Menu.SPAGETTI.toString().toLowerCase());
	}

	@Override
	public void buildDesert() {
	}

	@Override
	public void buildDrink() {
		dinner.setDrink(Menu.WATTER.toString().toLowerCase());
	}

	@Override
	public void buildAddDish() {
		dinner.setAddDish(Menu.BAGET.toString().toLowerCase());
	}

}
