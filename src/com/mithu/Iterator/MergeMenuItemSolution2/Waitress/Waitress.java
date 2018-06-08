package com.mithu.Iterator.MergeMenuItemSolution2.Waitress;

import com.mithu.Iterator.MergeMenuItemSolution2.Iterator;
import com.mithu.Iterator.MergeMenuItemSolution2.MainMenu;
import com.mithu.Iterator.MergeMenuItemSolution2.Menu;
import com.mithu.Iterator.MergeMenuItemSolution2.MirandaHouse.MirandaHouseMenu;
import com.mithu.Iterator.MergeMenuItemSolution2.PanCakeHouse.PancakeHouseMenu;

/**
 * Created by mithu on 8/6/18.
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu mirandaHouseMenu;

    public Waitress(Menu pancakeHouseMenu, Menu mirandaHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.mirandaHouseMenu = mirandaHouseMenu;
    }

    public void printMenu() {
        Iterator pancakeHouseMenuIterator= pancakeHouseMenu.createIterator();
        Iterator mirandaHouseMenuIterator= mirandaHouseMenu.createIterator();
        printMenu(pancakeHouseMenuIterator);
        printMenu(mirandaHouseMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()){
            MainMenu menuItem = (MainMenu) iterator.next();
            System.out.println(menuItem.getName() + ", " + menuItem.getDescription() + ", " + menuItem.getPrice());
        }
    }


}
