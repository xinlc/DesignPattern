package org.test.strategy;

/**
 * 实现吱吱叫
 * Created by lichao on 2017/9/20.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
