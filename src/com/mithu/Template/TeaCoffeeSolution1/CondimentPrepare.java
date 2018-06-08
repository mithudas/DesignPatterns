package com.mithu.Template.TeaCoffeeSolution1;

/**
 * Created by mithu on 8/6/18.
 */
public abstract class CondimentPrepare {
    final public void prepare(){ //template method
        boilWater();
        brew();
        pourInCup();
        addCondaminent();
    }

    void boilWater(){
        System.out.println("boiling some water");
    };
    void pourInCup(){
        System.out.println("pouring in a cup");
    };


    abstract void brew();
    abstract void addCondaminent();
}
