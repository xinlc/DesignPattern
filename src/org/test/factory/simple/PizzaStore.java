package org.test.factory.simple;

/**
 * Created by lichao on 2017/12/7.
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);

        pizza.box();
        return  pizza;
    }
}
