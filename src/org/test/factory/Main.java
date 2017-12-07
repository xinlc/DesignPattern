package org.test.factory;

/**
 * 工厂模式
 * 模拟
 *
 * 为什么要用工厂创建对象?
 * 因为我们面对接口编程,不应该面对现实编程(不应该显示调用new)
 *
 * 工厂方法模式:
 * 定义了一个创建对象的接口,但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
 *
 * 依赖倒置原则:
 * 要依赖抽象,不要依赖具体类。
 *
 * 抽象工厂模式:
 * 提供一个接口,用于创建相关或依赖对象的家族,而不需要明确指定具体类。
 * Created by lichao on 2017/12/7.
 */
public class Main {
    public static void main(String[] args) {

//        SimplePizzaFactory spf = new SimplePizzaFactory();
//        PizzaStore ps = new PizzaStore(spf);
//        ps.orderPizza("cheese");


        org.test.factory.PizzaStore nyStore = new NYPizzaStore();
        org.test.factory.PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());
        System.out.println();
        System.out.println();

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }

}
