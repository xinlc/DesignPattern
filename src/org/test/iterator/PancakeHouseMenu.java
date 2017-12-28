package org.test.iterator;

import java.util.ArrayList;

/**
 * Created by lichao on 2017/12/28.
 */
public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true, 2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                true, 3.49);
    }

//    public Iterator createIterator() {
//        return new PancakeHouseMenuIterator(menuItems);
//    }
    public java.util.Iterator createIterator() {
        return menuItems.iterator();
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description ,vegetarian ,price);
        menuItems.add(menuItem);
    }
}
