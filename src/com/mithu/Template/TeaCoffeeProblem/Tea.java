package com.mithu.Template.TeaCoffeeProblem;

/**
 * Created by mithu on 8/6/18.
 */
public class Tea {

    public void prepare(){
        boilWater();
        brew();
        pourInCup();
        addCondaminent();
    }

    private void boilWater(){
        System.out.println("boil some water");
    };
    private void brew(){
        System.out.println("add some tea in bolied water");
    };
    private void pourInCup(){
        System.out.println("pour cup in a cup");
    };

    private void addCondaminent() {
        System.out.println("add some sugar in tea");
    }
}
