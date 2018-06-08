package com.mithu.Decorator;

/**
 * Created by mithu on 1/6/18.
 */
public class Milk extends Decorators {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.description = ", Milk ";
    }

    @Override
    Float cost() {
        return beverage.cost()+0.25F;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + this.description;
    }
}
