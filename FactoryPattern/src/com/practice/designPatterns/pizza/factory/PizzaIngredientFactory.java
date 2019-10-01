package com.practice.designPatterns.pizza.factory;

import com.practice.designPatterns.pizzaIngredients.Cheese;
import com.practice.designPatterns.pizzaIngredients.Dough;
import com.practice.designPatterns.pizzaIngredients.Sauce;

//Abstract Factory
public interface PizzaIngredientFactory {
	Dough createDough();
	Cheese createCheese();
	Sauce createSauce();
}
