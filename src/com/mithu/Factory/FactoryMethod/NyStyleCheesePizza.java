package com.mithu.Factory.FactoryMethod;

/**
 * Created by mithu on 31/5/18.
 */
public class NyStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing NyStyleCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("baking NyStyleCheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting NyStyleCheesePizza");
    }
}
