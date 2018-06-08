package com.mithu.Decorator;

/**
 * Created by mithu on 1/6/18.
 */

public class Decaf extends Beverage {
    @Override
    public Float cost() {
        return 30.00F;
    }

    @Override
    public String getDescription() {
        return "Decaf";
    }
}
