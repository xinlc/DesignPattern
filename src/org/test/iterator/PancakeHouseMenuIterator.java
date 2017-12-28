package org.test.iterator;

import java.util.*;

/**
 * Created by lichao on 2017/12/28.
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) items.get(position);
        position ++;
        return menuItem;
    }
}
