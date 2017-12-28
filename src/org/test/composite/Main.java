package org.test.composite;

/**
 * 组合模式:
 * 允许你将对象组合成树形结构来表现"整体/部分" 层次结构。
 * 组合能让客户以一致的方式处理个别对象以及对象组合。
 *
 * 模拟合并餐厅打印所有菜单(见iterator)。
 * Created by lichao on 2017/12/28.
 */
public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89
        ));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pip with a flakey crust, topped with vanilla ice cream",
                true,
                1.59
        ));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

        waitress.printVegetarianMenu();

    }
}
