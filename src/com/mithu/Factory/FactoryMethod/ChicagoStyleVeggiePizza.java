package com.mithu.Factory.FactoryMethod;

/**
 * Created by mithu on 31/5/18.
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing ChicagoStyleVeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("baking ChicagoStyleVeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting ChicagoStyleVeggiePizza");
    }
}
