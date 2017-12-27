package org.test.adapter;

/**
 * Created by lichao on 2017/12/27.
 */
public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // 火鸡飞行没有鸭子距离长, 要想要火鸡飞行和鸭子差不多距离, 就连续叫火鸡飞
        for (int i=0; i < 5; i++) {
            turkey.fly();
        }
    }
}
