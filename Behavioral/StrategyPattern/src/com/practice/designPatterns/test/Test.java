package com.practice.designPatterns.test;

import com.practice.designPatterns.behavior.*;
import com.practice.designPatterns.duck.*;

public class Test {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new Quack(), new FlyWithWings());
        System.out.println("*** " + mallardDuck + " ***");
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.performFly();

        Duck rubberDuck = new RubberDuck(new Squeak(), new NoFly());
        System.out.println("*** " + rubberDuck + " ***");
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.swim();
        rubberDuck.performFly();

        Duck rocketDuck = new RocketDuck(new Mute(), new FlyWithRocketPower());
        System.out.println("*** " + rocketDuck + " ***");
        rocketDuck.display();
        rocketDuck.performQuack();
        rocketDuck.swim();
        rocketDuck.performFly();

        //Changing the behavior(alogorithm/strategy) at run time
        System.out.println("*** " + rubberDuck + " ***");
        rubberDuck.setFlyBehavior(new FlyWithWings());
        rubberDuck.performFly();
    }
}
