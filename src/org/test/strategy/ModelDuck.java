package org.test.strategy;

/**
 * 模型鸭
 * Created by lichao on 2017/9/20.
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
       System.out.println("I'm a model duck");
    }
}

