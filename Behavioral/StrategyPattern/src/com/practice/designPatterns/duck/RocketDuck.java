package com.practice.designPatterns.duck;

import com.practice.designPatterns.behavior.FlyBehavior;
import com.practice.designPatterns.behavior.QuackBehavior;

public class RocketDuck extends Duck {

    public RocketDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super("Rocket Duck", quackBehavior, flyBehavior);
    }

    @Override
    public void swim() {
        System.out.println("Cannot swim");
    }

    @Override
    public void display() {
        System.out.println("Looks like rocket");
    }
}
