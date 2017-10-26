package org.test.decorator;

/**
 * Created by lichao on 2017/10/26.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }

}
