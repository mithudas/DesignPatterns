package com.mithu.Decorator;

/**
 * Created by mithu on 1/6/18.
 */
public class App {
    public static void main(String[] args) {
        Beverage beverage1= new Expresso();
        beverage1=new Mocha(beverage1);
        beverage1=new Milk(beverage1);
        beverage1=new Soy(beverage1);
        beverage1=new Whip(beverage1);
        System.out.println(beverage1.getDescription() +"<<<<<cost>>>>>" +beverage1.cost());

        beverage1= new Decaf();
        beverage1=new Mocha(beverage1);
        beverage1=new Milk(beverage1);
        beverage1=new Soy(beverage1);
        beverage1=new Whip(beverage1);
        System.out.println(beverage1.getDescription() +"<<<<<cost>>>>>" +beverage1.cost());

        beverage1= new DarkRoast();
        beverage1=new Mocha(beverage1);
        beverage1=new Milk(beverage1);
        beverage1=new Soy(beverage1);
        beverage1=new Whip(beverage1);
        System.out.println(beverage1.getDescription() +"<<<<<cost>>>>>" +beverage1.cost());

    }
}
