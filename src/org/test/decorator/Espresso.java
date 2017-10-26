package org.test.decorator;

/**
 * 浓缩咖啡
 * Created by lichao on 2017/10/26.
 */
public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
