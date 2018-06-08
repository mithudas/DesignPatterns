package com.mithu.Iterator.MergeMenuItemsProblem.PanCakeHouse;

/**
 * Created by mithu on 8/6/18.
 */
public class MenuItem {
    String name;
    String desciption;
    Double price;

    public MenuItem(String name, String desciption, Double price) {
        this.name = name;
        this.desciption = desciption;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesciption() {
        return desciption;
    }

    public Double getPrice() {
        return price;
    }
}
