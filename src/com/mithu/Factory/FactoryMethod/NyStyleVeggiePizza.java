package com.mithu.Factory.FactoryMethod;

/**
 * Created by mithu on 31/5/18.
 */
public class NyStyleVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing NyStyleVeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("baking NyStyleVeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting NyStyleVeggiePizza");
    }
}
