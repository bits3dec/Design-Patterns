package com.practice.designPatterns.behavior;

public class Mute implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Mute");
	}
}
