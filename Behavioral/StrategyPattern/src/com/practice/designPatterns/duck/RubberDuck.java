package com.practice.designPatterns.duck;

import com.practice.designPatterns.behavior.FlyBehavior;
import com.practice.designPatterns.behavior.QuackBehavior;

public class RubberDuck extends Duck {

	public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
		super("Rubber Duck", quackBehavior, flyBehavior);
	}

	@Override
	public void display() {
		System.out.println("Looks like rubber duck");
	}
}
