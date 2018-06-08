package com.mithu.Iterator.MergeMenuItemSolution2;

import com.mithu.Iterator.MergeMenuItemSolution2.MirandaHouse.MirandaHouseMenu;
import com.mithu.Iterator.MergeMenuItemSolution2.PanCakeHouse.PancakeHouseMenu;
import com.mithu.Iterator.MergeMenuItemSolution2.Waitress.Waitress;

/**
 * Created by mithu on 8/6/18.
 */
public class App {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        MirandaHouseMenu mirandaHouseMenu;
        mirandaHouseMenu = new MirandaHouseMenu();
        Waitress waitress= new Waitress(pancakeHouseMenu, mirandaHouseMenu);
        waitress.printMenu();
    }
}
