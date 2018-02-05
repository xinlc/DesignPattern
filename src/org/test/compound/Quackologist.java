package org.test.compound;

/**
 * Created by lichao on 2018/2/5.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        // 打印正在叫的对象
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
