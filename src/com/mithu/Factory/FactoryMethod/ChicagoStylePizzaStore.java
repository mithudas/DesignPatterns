package com.mithu.Factory.FactoryMethod;

/**
 * Created by mithu on 31/5/18.
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type=="cheese"){
            pizza=new ChicagoStyleCheesePizza();
        }else if (type=="veggie"){
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
