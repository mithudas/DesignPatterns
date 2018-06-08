package com.mithu.Template.TeaCoffeeSolutionUsingHook;

/**
 * Created by mithu on 8/6/18.
 */
public abstract class CondimentPrepare {
    final public void prepare(){ //template method
        boilWater();
        brew();
        pourInCup();
        addCondaminent();
        if(askedForLemon()){
            addLemon();
        }
    }

     boolean askedForLemon() {
        return true;
    }

    void boilWater(){
        System.out.println("boiling some water");
    };
    void pourInCup(){
        System.out.println("pouring in a cup");
    };



    abstract void brew();
    abstract void addCondaminent();
    void addLemon(){};
}
