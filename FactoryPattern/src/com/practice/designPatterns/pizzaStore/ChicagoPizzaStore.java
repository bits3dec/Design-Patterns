package com.practice.designPatterns.pizzaStore;

import com.practice.designPatterns.pizza.*;
import com.practice.designPatterns.pizza.Pizza;
import com.practice.designPatterns.pizza.factory.ChicagoIngredientFactory;
import com.practice.designPatterns.pizza.factory.PizzaIngredientFactory;

//Concrete Creator B
public class ChicagoPizzaStore extends PizzaStore {

	PizzaIngredientFactory ingredientFactory;
	
	public ChicagoPizzaStore() {
		this.ingredientFactory = new ChicagoIngredientFactory();
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
