package com.mithu.Iterator.MergeMenuItemSolution2.MirandaHouse;

import com.mithu.Iterator.MergeMenuItemSolution2.MainMenu;

/**
 * Created by mithu on 8/6/18.
 */
public class MenuItem implements MainMenu {
    String name;
    String description;
    Boolean vegeterian;
    Double price;

    public MenuItem(String name, String description, Boolean vegeterian, Double price) {
        this.name = name;
        this.description = description;
        this.vegeterian = vegeterian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getVegeterian() {
        return vegeterian;
    }

    public Double getPrice() {
        return price;
    }
}
