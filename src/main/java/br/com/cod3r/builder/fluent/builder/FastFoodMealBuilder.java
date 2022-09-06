package br.com.cod3r.builder.fluent.builder;

import br.com.cod3r.builder.fluent.model.FastFoodMeal;

public class FastFoodMealBuilder {

    private String side;

    private String drink;
    private String main;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder(String side) {
        this.side = side;
    }

    public FastFoodMealBuilder drink(String drink) {
        this.drink = drink;
        return this;
    }

    public FastFoodMealBuilder main(String main) {
        this.main = main;
        return this;
    }

    public FastFoodMealBuilder dessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public FastFoodMealBuilder gift(String gift) {
        this.gift = gift;
        return this;
    }

    public FastFoodMeal build() {
        return new FastFoodMeal(drink, main, side, dessert, gift);
    }
}
