package com.mithu.Iterator.MergeMenuItemSolution2.MirandaHouse;

import com.mithu.Iterator.MergeMenuItemSolution2.Iterator;

/**
 * Created by mithu on 8/6/18.
 */
public class MirandaHouseMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position;

    public MirandaHouseMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >=  menuItems.length || menuItems[position]==null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        if(position < menuItems.length){
            return menuItems[position++];
        }else {
            return null;
        }
    }
}
