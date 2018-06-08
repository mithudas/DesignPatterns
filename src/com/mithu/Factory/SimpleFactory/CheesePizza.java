package com.mithu.Factory.SimpleFactory;

/**
 * Created by mithu on 31/5/18.
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking cheese pizza");
    }

    @Override
    public void cut() {
        System.out.printf("cutting cheese pizza");
    }
}
