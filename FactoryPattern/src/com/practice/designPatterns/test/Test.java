package com.practice.designPatterns.test;

import com.practice.designPatterns.pizza.Pizza;
import com.practice.designPatterns.pizzaStore.*;

public class Test {
	public static void main(String[] args) {
		System.out.println("*** Welcome to NYPizza Store ***");
		PizzaStore nyPizzaStore = new NYPizzaStore();
		System.out.println("Ordering Pizza...");
		Pizza  nyCheesePizza = nyPizzaStore.orderPizza("Cheese");
		
		System.out.println("*** Welcome to ChicagoPizza Store ***");
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		System.out.println("Ordering Pizza...");
		Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza("Veggie");
		
		System.out.println("** Your Orders ***");
		System.out.println(nyCheesePizza);
		System.out.println(chicagoCheesePizza);
	}
}
