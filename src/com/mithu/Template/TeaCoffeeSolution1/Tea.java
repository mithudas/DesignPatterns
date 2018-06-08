package com.mithu.Template.TeaCoffeeSolution1;

/**
 * Created by mithu on 8/6/18.
 */
public class Tea extends CondimentPrepare {
    protected void brew(){
        System.out.println("add some tea in bolied water");
    };
    protected void addCondaminent() {
        System.out.println("add some sugar in tea");
    }
}
