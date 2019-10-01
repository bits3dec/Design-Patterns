package com.practice.designPatterns.pizza;

import com.practice.designPatterns.pizza.factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		dough = ingredientFactory.createDough();
		cheese = ingredientFactory.createCheese();
		sauce = ingredientFactory.createSauce();
	}
}
