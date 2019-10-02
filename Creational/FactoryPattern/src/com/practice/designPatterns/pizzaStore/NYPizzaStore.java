package com.practice.designPatterns.pizzaStore;

import com.practice.designPatterns.pizza.*;
import com.practice.designPatterns.pizza.Pizza;
import com.practice.designPatterns.pizza.factory.NYIngredientFactory;
import com.practice.designPatterns.pizza.factory.PizzaIngredientFactory;

//Concrete Creator A
public class NYPizzaStore extends PizzaStore {
	PizzaIngredientFactory ingredientFactory;
	
	public NYPizzaStore() {
		this.ingredientFactory = new NYIngredientFactory();
	}
	
	@Override
	protected Pizza createPizza(String type) {
		if(type == "Cheese") {
			return new CheesePizza(ingredientFactory);
		}
		if(type == "Veggie") {
			return new VeggiePizza(ingredientFactory);
		}
		return null;
	}
}
