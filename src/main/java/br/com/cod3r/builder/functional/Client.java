package br.com.cod3r.builder.functional;

import br.com.cod3r.builder.functional.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		final FastFoodMeal meal = new FastFoodMeal.Builder("Fries")
				.main("CheeseBurger")
				.dessert("Fudge Cake")
				.drink("Milk Shake")
				.gift("2 Kilograms")
				.build();

		System.out.println(meal);
	}
}