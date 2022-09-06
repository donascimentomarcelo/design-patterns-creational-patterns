package br.com.cod3r.builder.functional.model;

public class FastFoodMeal {

	private final String drink;
	private final String main;
	private final String side;
	private final String dessert;
	private final String gift;

	public FastFoodMeal(final String drink, final String main, final String side, final String dessert, final String gift) {
		this.drink = drink;
		this.main = main;
		this.side = side;
		this.dessert = dessert;
		this.gift = gift;
	}

	public String getDrink() {
		return drink;
	}

	public String getMain() {
		return main;
	}

	public String getSide() {
		return side;
	}

	public String getDessert() {
		return dessert;
	}

	public String getToy() {
		return gift;
	}

	@Override
	public String toString() {
		return "Combo [drink=" + drink + ", main=" + main + ", side=" 
				+ side + ", dessert=" + dessert + ", gift=" + gift + "]";
	}

	public static class Builder {
		private String side;
		private String drink;
		private String main;
		private String dessert;
		private String gift;

		public Builder(String side) {
			this.side = side;
		}

		public Builder drink(String drink) {
			this.drink = drink;
			return this;
		}

		public Builder main(String main) {
			this.main = main;
			return this;
		}

		public Builder dessert(String dessert) {
			this.dessert = dessert;
			return this;
		}

		public Builder gift(String gift) {
			this.gift = gift;
			return this;
		}

		public FastFoodMeal build() {
			return new FastFoodMeal(drink, main, side, dessert, gift);
		}
	}
}
