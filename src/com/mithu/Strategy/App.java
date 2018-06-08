package com.mithu.Strategy;

/**
 * Created by mithu on 1/6/18.
 */
public class App {
    public static void main(String[] args) {
        System.out.println(">>>>>Mallard Duck>>>>>");
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        System.out.println(">>>>>plastic duck>>>>>>>>");
        Duck duck1 = new PlasticDuck();
        duck1.performFly();
        duck1.performQuack();

        System.out.println(">>>>>after chaning flying behaviour of plastic duck>>>>");
        duck1.setFlyBehaviour(new FlyWithWings());
        duck1.performFly();
    }
}
