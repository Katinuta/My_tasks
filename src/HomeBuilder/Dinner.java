package HomeBuilder;

/**
 * Class contains elements of dinner, set and get methods for all fields of
 * class, overrides method "toString"
 */

public class Dinner {
	String firstDish;
	String secondDish;
	String desert;
	String drink;
	String addDish;

	public String getFirstDish() {
		return firstDish;
	}

	public void setFirstDish(String firstDish) {
		this.firstDish = firstDish;
	}

	public String getSecondDish() {
		return secondDish;
	}

	public void setSecondDish(String secondDish) {
		this.secondDish = secondDish;
	}

	public String getDesert() {
		return desert;
	}

	public void setDesert(String desert) {
		this.desert = desert;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getAddDish() {
		return addDish;
	}

	public void setAddDish(String addDish) {
		this.addDish = addDish;
	}

	@Override
	public String toString() {
		StringBuffer order = new StringBuffer();
		order.append("Order dinner: ");
		if (firstDish != null) {
			order.append(firstDish + "    ");
		}
		if (secondDish != null) {
			order.append(secondDish + "    ");
		}
		if (desert != null) {
			order.append(desert + "    ");
		}
		if (drink != null) {
			order.append(drink + "    ");
		}
		if (addDish != null) {
			order.append(addDish);
		}
		return order.toString();
	}

}
