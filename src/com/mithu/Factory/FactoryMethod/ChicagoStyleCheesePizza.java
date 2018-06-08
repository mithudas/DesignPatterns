package com.mithu.Factory.FactoryMethod;

/**
 * Created by mithu on 31/5/18.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing ChicagoStyleCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("baking ChicagoStyleCheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting ChicagoStyleCheesePizza");
    }
}
