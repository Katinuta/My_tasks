package HomeBuilder;

/**
 * Class cotains override methods for build fields of class Dinner for full dinner
 */

public class FullDinnerBuilder extends BaseBuilder {

	@Override
	public void buildFirstDish() {
		dinner.setFirstDish(Menu.MUSHROOM_SOUP.toString().toLowerCase());
	}

	@Override
	public void buildSecondDish() {
		dinner.setSecondDish(Menu.POTATO_WITH_FRIED_CHIKEN.toString().toLowerCase());
	}

	@Override
	public void buildDesert() {
		dinner.setDesert(Menu.ECLAIR .toString().toLowerCase());
	}

	@Override
	public void buildDrink() {
		dinner.setDrink(Menu.JUICE.toString().toLowerCase());
	}

	@Override
	public void buildAddDish() {
		dinner.setAddDish(Menu.BREAD.toString().toLowerCase());
	}

}
