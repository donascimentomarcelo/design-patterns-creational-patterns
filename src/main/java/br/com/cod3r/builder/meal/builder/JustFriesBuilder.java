package br.com.cod3r.builder.meal.builder;

public class JustFriesBuilder extends FastFoodMealBuilder {

    @Override
    public void buildDessert() {
        meal.setDessert("Large IceCream");
    }

}
