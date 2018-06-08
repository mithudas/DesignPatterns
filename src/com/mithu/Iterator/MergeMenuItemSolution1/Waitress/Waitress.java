package com.mithu.Iterator.MergeMenuItemSolution1.Waitress;

import com.mithu.Iterator.MergeMenuItemSolution1.Iterator;
import com.mithu.Iterator.MergeMenuItemSolution1.Menu;
import com.mithu.Iterator.MergeMenuItemSolution1.MainMenu;
import com.mithu.Iterator.MergeMenuItemSolution1.MirandaHouse.MirandaHouseMenu;
import com.mithu.Iterator.MergeMenuItemSolution1.PanCakeHouse.PancakeHouseMenu;

import java.util.ArrayList;

/**
 * Created by mithu on 8/6/18.
 */
public class Waitress {

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu mirandaHouseMenu = new MirandaHouseMenu();
        Iterator pancakeHouseMenuIterator= pancakeHouseMenu.createIterator();
        Iterator mirandaHouseMenuIterator= mirandaHouseMenu.createIterator();
        printMenu(pancakeHouseMenuIterator);
        printMenu(mirandaHouseMenuIterator);
    }

    private static void printMenu(Iterator iterator) {
        while(iterator.hasNext()){
            MainMenu menuItem = (MainMenu) iterator.next();
            System.out.println(menuItem.getName() + ", " + menuItem.getDescription() + ", " + menuItem.getPrice());
        }
    }


}
