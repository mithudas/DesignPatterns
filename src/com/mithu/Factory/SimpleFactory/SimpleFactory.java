package com.mithu.Factory.SimpleFactory;

/**
 * Created by mithu on 31/5/18.
 */
public class SimpleFactory {

    protected Pizza createPizza(String type) {
        Pizza pizza=null;
        if(type=="cheese") {
            pizza=  new CheesePizza();
        } else if (type=="veggie"){
            pizza= new VeggiePizza();
        }
        return pizza;
    }
}
