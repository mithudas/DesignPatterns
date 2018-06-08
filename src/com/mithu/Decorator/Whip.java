package com.mithu.Decorator;

/**
 * Created by mithu on 1/6/18.
 */
public class Whip extends Decorators {
    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage= beverage;
        this.description = ", Whip ";
    }

    @Override
    public Float cost() {
        return beverage.cost()+.25F;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + this.description;
    }
}
