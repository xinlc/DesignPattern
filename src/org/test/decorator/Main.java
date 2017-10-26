package org.test.decorator;

/**
 * 装饰者模式
 * 模拟饮料
 *
 * 装饰者模式: 动态地将责任附加到对象上。若要扩展功能,装饰者提供了比继承更有弹性的代替方案。
 * Created by lichao on 2017/10/25.
 */
public class Main {
    public static void main(String [] args) {

        // 来一杯Espresso, 不需要调料
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 来一杯调料为豆浆,摩卡,奶泡的HouseBlend咖啡
        Beverage beverage1 = new HouseBlend();
        // beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        // beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
