package org.test.strategy;

/**
 * 实现飞行动作
 * Created by lichao on 2017/9/20.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}

