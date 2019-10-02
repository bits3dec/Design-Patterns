package com.practice.designPatterns.pizza.factory;

import com.practice.designPatterns.pizzaIngredients.*;

//Concrete Factory A
public class NYIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

}
