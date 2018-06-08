package com.mithu.Factory.FactoryMethod;


/**
 * Created by mithu on 31/5/18.
 */
public abstract class PizzaStore {

    public void orderPizza(String type){
        Pizza pizza= createPizza(type);
        pizza.bake();
        pizza.prepare();
        pizza.cut();
    }

    protected abstract Pizza createPizza(String type);


}
