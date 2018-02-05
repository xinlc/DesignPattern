package org.test.compound;

/**
 * 鸭子工厂抽象类
 * Created by lichao on 2018/2/5.
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
