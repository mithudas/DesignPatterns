package com.mithu.Iterator.MergeMenuItemSolution1.PanCakeHouse;

import com.mithu.Iterator.MergeMenuItemSolution1.MainMenu;

/**
 * Created by mithu on 8/6/18.
 */
public class MenuItem implements MainMenu {
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

    public String getDescription() {
        return desciption;
    }
    public Double getPrice() {
        return price;
    }
}
