package org.test.strategy;

/**
 * 实现呱呱叫
 * Created by lichao on 2017/9/20.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
