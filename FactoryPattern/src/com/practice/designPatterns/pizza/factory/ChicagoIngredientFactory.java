package com.practice.designPatterns.pizza.factory;

import com.practice.designPatterns.pizzaIngredients.*;

//Concrete Factory B
public class ChicagoIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new MozarellaCheese();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

}
