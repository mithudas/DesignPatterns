package com.mithu.Decorator;

/**
 * Created by mithu on 1/6/18.
 */
public class Soy extends Decorators {
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage= beverage;
        this.description = ", Soy ";
    }

    @Override
    public Float cost() {
        return beverage.cost()+.80F;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + this.description;

    }
}
