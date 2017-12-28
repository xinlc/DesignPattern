package org.test.iterator;

/**
 * Created by lichao on 2017/12/28.
 */
public class DinerMenuIterator implements java.util.Iterator{
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if(items[position-1] != null) {
            for (int i = position - 1; i < items.length - 1; i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
