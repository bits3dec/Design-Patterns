package com.practice.designPatterns.duck;

import com.practice.designPatterns.behavior.FlyBehavior;
import com.practice.designPatterns.behavior.QuackBehavior;

public class MallardDuck extends Duck {

    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super("Mallard Duck", quackBehavior, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("Looks like mallard duck");
    }
}

