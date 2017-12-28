package org.test.iterator;

/**
 * 迭代器模式:
 * 提供一种方法顺序访问一个聚合对象中的各个元素,而又不暴露其内部的表示。
 *
 * 设计原则: 单一责任(一个类应该只有一个引起变化的原因)。
 *
 * 模拟餐厅和煎饼屋合并, 服务员打印两种菜单。
 * Created by lichao on 2017/12/28.
 */
public class Main {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
