package org.test.factory;

/**
 * 抽象披萨商店,由子类实现工厂
 * Created by lichao on 2017/12/7.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
