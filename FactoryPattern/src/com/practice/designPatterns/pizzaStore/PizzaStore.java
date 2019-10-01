package com.practice.designPatterns.pizzaStore;

import com.practice.designPatterns.pizza.Pizza;

//Factory Method Pattern
//Abstract Creator
public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		if(pizza == null) {
			System.out.println("The choosen pizza is not available !!!");
			return null;
		}
		pizza.prepare();
		pizza.cut();
		pizza.box();	
		return pizza;
	}
	
	//Factory Method
	protected abstract Pizza createPizza(String type);
}
