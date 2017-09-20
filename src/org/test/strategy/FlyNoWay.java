package org.test.strategy;

/**
 * 不会飞
 * Created by lichao on 2017/9/20.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
