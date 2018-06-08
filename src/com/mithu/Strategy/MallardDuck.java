package com.mithu.Strategy;

/**
 * Created by mithu on 1/6/18.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehaviour=new FlyWithWings();
        this.quackBehaviour= new MuteQuack();

    }
}
