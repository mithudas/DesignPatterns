package com.mithu.Decorator;

/**
 * Created by mithu on 1/6/18.
 */
public class DarkRoast extends Beverage {
    @Override
    public Float cost() {
        return 5.00F;
    }

    @Override
    public String getDescription() {
        return "DarkRoast";
    }
}
