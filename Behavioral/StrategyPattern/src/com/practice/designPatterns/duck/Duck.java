package com.practice.designPatterns.duck;

import com.practice.designPatterns.behavior.FlyBehavior;
import com.practice.designPatterns.behavior.QuackBehavior;

public abstract class Duck {
	String name;
	//Behaviors
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	Duck(String name, QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
		this.name = name;
		this.quackBehavior = quackBehavior;
		this.flyBehavior = flyBehavior;
	}
	
	public void swim() {
		System.out.println("Swimming");
	}
		
	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}
		
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public abstract void display();
	
	@Override
	public String toString() {
		return name;
	}
}
