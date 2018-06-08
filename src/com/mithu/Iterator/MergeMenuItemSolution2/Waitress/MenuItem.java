package com.mithu.Iterator.MergeMenuItemSolution2.Waitress;

import com.mithu.Iterator.MergeMenuItemSolution2.MainMenu;

/**
 * Created by mithu on 8/6/18.
 */
public class MenuItem implements MainMenu {
    String name;
    String description;
    Double price;

    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public Double getPrice() {
        return price;
    }
}
