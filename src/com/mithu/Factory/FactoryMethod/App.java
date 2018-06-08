package com.mithu.Factory.FactoryMethod;

/**
 * Created by mithu on 31/5/18.
 */
public class App {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NyStylePizzaStore();
        pizzaStore.orderPizza("cheese");
        System.out.println("\n");

        pizzaStore.orderPizza("veggie");
        System.out.println("\n");

        pizzaStore = new ChicagoStylePizzaStore();
        pizzaStore.orderPizza("cheese");
        System.out.println("\n");

        pizzaStore.orderPizza("veggie");
        System.out.println("\n");

    }
}
