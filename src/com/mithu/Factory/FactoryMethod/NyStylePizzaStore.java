package com.mithu.Factory.FactoryMethod;

/**
 * Created by mithu on 31/5/18.
 */
public class NyStylePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type=="cheese"){
            pizza=new NyStyleCheesePizza();
        }else if (type=="veggie"){
            pizza = new NyStyleVeggiePizza();
        }
        return pizza;
    }
}
