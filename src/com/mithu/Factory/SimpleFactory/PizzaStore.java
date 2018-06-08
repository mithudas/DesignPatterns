package com.mithu.Factory.SimpleFactory;

/**
 * Created by mithu on 31/5/18.
 */
public class PizzaStore {
    private SimpleFactory factory;

    public PizzaStore(SimpleFactory simpleFactory) {
        this.factory = simpleFactory;
    }

    public void orderPizza(String type){
        Pizza pizza= factory.createPizza(type);
        pizza.bake();
        pizza.prepare();
        pizza.cut();
    }


}
