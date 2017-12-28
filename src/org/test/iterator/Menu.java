package org.test.iterator;

import java.util.Iterator;

/**
 * Created by lichao on 2017/12/28.
 */
public interface Menu {
    public Iterator createIterator();
    public void addItem(String name, String description,
                        boolean vegetarian, double price);
}
