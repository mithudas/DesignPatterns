package com.mithu.Iterator.MergeMenuItemSolution1.PanCakeHouse;

import com.mithu.Iterator.MergeMenuItemSolution1.Iterator;

import java.util.ArrayList;

/**
 * Created by mithu on 8/6/18.
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList menuItems;
    int position=0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position< menuItems.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(position< menuItems.size()){
            return menuItems.get(position++);
        }else {
            return null;
        }
    }
}
