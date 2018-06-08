package com.mithu.Decorator;

/**
 * Created by mithu on 1/6/18.
 */
public class Expresso extends Beverage {
    @Override
    public Float cost() {
        return 20.00F;
    }

    @Override
    public String getDescription() {
        return "Expresso";
    }
}
