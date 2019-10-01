package com.practice.designPatterns.pizza;

import com.practice.designPatterns.pizza.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		dough = ingredientFactory.createDough();
		cheese = ingredientFactory.createCheese();
		sauce = ingredientFactory.createSauce();
	}
}
