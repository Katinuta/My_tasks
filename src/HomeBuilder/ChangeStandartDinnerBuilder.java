package HomeBuilder;

/**
 * Class cotains override methods for build need fields of object of class
 * Dinner for change standart dinner
 */

public class ChangeStandartDinnerBuilder extends BaseBuilder {

	@Override
	public void buildFirstDish() {
		dinner.setFirstDish(Menu.CAESAR_SALAD.toString().toLowerCase());
	}

	@Override
	public void buildSecondDish() {
		dinner.setSecondDish(Menu.POTATO_WITH_FRIED_CHIKEN.toString().toLowerCase());
	}

	@Override
	public void buildDesert() {
	}

	@Override
	public void buildDrink() {
		dinner.setDrink(Menu.TEA.toString().toLowerCase());
	}

	@Override
	public void buildAddDish() {
		dinner.setAddDish(Menu.KETCHUP.toString().toLowerCase());
	}

}
