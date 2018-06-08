package com.mithu.Strategy;

/**
 * Created by mithu on 1/6/18.
 */
public class SqueakQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("squeak squeak squeak");
    }
}
