package com.mithu.Iterator.MergeMenuItemsProblem.MirandaHouse;


/**
 * Created by mithu on 8/6/18.
 */
public class MirandaHouse {
    static final int Max_No_Items = 6;
    private int number_of_items = 0;
    MenuItem[] menuItems;

    public MirandaHouse() {
        menuItems=new MenuItem[Max_No_Items];
        addItem("Pasta", "Pasta with Italian Sauce", true, 100.00);
        addItem("Noodles", "Noodles with chinese Sauce", false, 150.00);
        addItem("Pizza", "Pizza with garlic bread", true, 200.00);
    }

    private void addItem(String name, String description, Boolean vegeteraian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegeteraian, price);
        if (number_of_items < Max_No_Items) {
            menuItems[number_of_items] = menuItem;
            number_of_items++;
        } else {
            System.out.println("Sorry we cannot add more than 6 items");
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }


}
