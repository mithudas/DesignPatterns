package com.mithu.Iterator.MergeMenuItemsProblem.Waitress;

import com.mithu.Iterator.MergeMenuItemsProblem.MirandaHouse.MirandaHouse;
import com.mithu.Iterator.MergeMenuItemsProblem.MirandaHouse.MenuItem;
import com.mithu.Iterator.MergeMenuItemsProblem.PanCakeHouse.PancakeHouseMenu;

import java.util.ArrayList;

/**
 * Created by mithu on 8/6/18.
 */
public class Waitress {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        MirandaHouse mirandaHouse = new MirandaHouse();

        ArrayList breakFastMenu =  pancakeHouseMenu.getMenuItems();
        MenuItem[] lunchMenu = mirandaHouse.getMenuItems();

        printBreakFastMenu(breakFastMenu); //need two separate methods to get the menuItems each time.
        printLunchMenu(lunchMenu);
    }

    private static void printLunchMenu(MenuItem[] lunchMenu) {
        for(int i=0; i<lunchMenu.length; i++){
            MenuItem menuItem = lunchMenu[i];
            if(menuItem!=null){
                System.out.println(menuItem.getName() + ", " + menuItem.getDescription() +", " + menuItem.getPrice());
            }
        }
    }

    private static void printBreakFastMenu(ArrayList breakFastMenu) {
        for(int i =0; i< breakFastMenu.size(); i++){
            com.mithu.Iterator.MergeMenuItemsProblem.PanCakeHouse.MenuItem menuItem = (com.mithu.Iterator.MergeMenuItemsProblem.PanCakeHouse.MenuItem) breakFastMenu.get(i);
            System.out.println(menuItem.getName() + ", " + menuItem.getDesciption() + ", " + menuItem.getPrice());
        }
    }


}
