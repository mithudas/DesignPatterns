package com.mithu.Decorator;

/**
 * Created by mithu on 1/6/18.
 */
public class HouseBlend  extends Beverage {
    @Override
    public Float cost() {
        return 10.00F;
    }

    @Override
    public String getDescription() {
        return "HouseBlend";
    }
}
