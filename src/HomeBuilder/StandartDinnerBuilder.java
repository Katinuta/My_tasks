package HomeBuilder;

/**
 * Class contains override methods for build fields of class Dinner for standart
 * dinner
 */

public class StandartDinnerBuilder extends BaseBuilder {

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
	}

	@Override
	public void buildDrink() {
		dinner.setDrink(Menu.JUICE.toString().toLowerCase());
	}

	@Override
	public void buildAddDish() {
	}

}
