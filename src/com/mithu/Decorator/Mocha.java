package com.mithu.Decorator;

/**
 * Created by mithu on 1/6/18.
 */
public class Mocha extends Decorators {
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage= beverage;
        this.description = ", Mocha ";
    }

    @Override
    public Float cost() {
        return beverage.cost()+.50F;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + this.description;
    }
}
