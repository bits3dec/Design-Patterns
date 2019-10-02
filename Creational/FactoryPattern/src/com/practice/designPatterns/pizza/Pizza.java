package com.practice.designPatterns.pizza;

import com.practice.designPatterns.pizzaIngredients.*;

public abstract class Pizza {
	Dough dough;
	Cheese cheese;
	Sauce sauce;

	public abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes");
	}
	
	public void cut() {
		System.out.println("Cut in diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	@Override
	public String toString() {
		return "Pizza [dough=" + dough.getName() + ", cheese=" + cheese.getName() + ", sauce=" + sauce.getName() + "]";
	}
}
