package com.mithu.Factory.SimpleFactory;

/**
 * Created by mithu on 31/5/18.
 */
public class VeggiePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("preparing veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking veggie pizza");
    }

    @Override
    public void cut() {
        System.out.printf("cutting veggie pizza");
    }
}
