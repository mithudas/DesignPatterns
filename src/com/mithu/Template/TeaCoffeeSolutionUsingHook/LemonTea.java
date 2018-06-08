package com.mithu.Template.TeaCoffeeSolutionUsingHook;

/**
 * Created by mithu on 8/6/18.
 */
public class LemonTea extends CondimentPrepare {
    protected void brew(){
        System.out.println("add some tea in bolied water");
    };
    protected void addCondaminent() {
        System.out.println("add some sugar in tea");
    }
    protected void addLemon() {
        System.out.println("add some Lemon in tea");
    }
}
