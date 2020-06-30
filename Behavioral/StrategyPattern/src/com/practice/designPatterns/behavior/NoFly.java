package com.practice.designPatterns.behavior;

public class NoFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }

}
