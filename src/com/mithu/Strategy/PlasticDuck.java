package com.mithu.Strategy;

/**
 * Created by mithu on 1/6/18.
 */
public class PlasticDuck  extends Duck{
    public PlasticDuck() {
        this.flyBehaviour=new FlyNotApplicable();
        this.quackBehaviour=new SqueakQuack();
    }
}
