package com.mithu.Iterator.MergeMenuItemsProblem.PanCakeHouse;

import java.util.ArrayList;

/**
 * Created by mithu on 8/6/18.
 */
public class PancakeHouseMenu {
    ArrayList<MenuItem> menuList;

    public PancakeHouseMenu(){
        menuList= new ArrayList<MenuItem>();
        addItem("cake", "chocolateCake", 10.00);
        addItem("egg", "scrumbbledEgg", 12.00);
        addItem("Bread", "toasted bread", 15.00);
        addItem("Idli", "Idli in south indian style", 20.00);
    }

    private void addItem(String name, String description,Double price){
        MenuItem menuItem = new MenuItem(name, description, price);
        menuList.add(menuItem);
    }

    public ArrayList getMenuItems(){
        return menuList;
    }
}
