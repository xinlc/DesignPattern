package org.test.factory;

/**
 * Created by lichao on 2017/12/7.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
