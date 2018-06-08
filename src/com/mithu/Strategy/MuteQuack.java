package com.mithu.Strategy;

/**
 * Created by mithu on 1/6/18.
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("this cannot quack");
    }
}
