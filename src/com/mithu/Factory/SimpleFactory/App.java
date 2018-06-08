package com.mithu.Factory.SimpleFactory;

/**
 * Created by mithu on 31/5/18.
 */
public class App {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimpleFactory());
        pizzaStore.orderPizza("cheese");
        System.out.println("\n");
        pizzaStore.orderPizza("veggie");
    }
}
