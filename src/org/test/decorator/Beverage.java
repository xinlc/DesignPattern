package org.test.decorator;

/**
 * 饮料抽象类
 * Created by lichao on 2017/10/25.
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
