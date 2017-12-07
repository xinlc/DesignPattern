package org.test.factory.simple;

/**
 * Created by lichao on 2017/12/7.
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("CheesePizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza.bake");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza.cut");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza.box");
    }
}
