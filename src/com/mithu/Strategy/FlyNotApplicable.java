package com.mithu.Strategy;

/**
 * Created by mithu on 1/6/18.
 */
public class FlyNotApplicable implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("this cannot fly");
    }
}
