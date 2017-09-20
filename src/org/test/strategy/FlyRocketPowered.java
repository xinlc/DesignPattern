package org.test.strategy;

/**
 * 利用火箭动力飞行行为
 * Created by lichao on 2017/9/20.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
