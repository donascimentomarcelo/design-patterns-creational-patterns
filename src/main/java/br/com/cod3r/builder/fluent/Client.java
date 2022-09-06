package br.com.cod3r.builder.fluent;

import br.com.cod3r.builder.fluent.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.fluent.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		final FastFoodMeal meal = new FastFoodMealBuilder("Fries")
				.main("CheeseBurger")
				.dessert("Fudge Cake")
				.drink("Milk Shake")
				.gift("2 Kilograms")
				.build();

		System.out.println(meal);
	}
}