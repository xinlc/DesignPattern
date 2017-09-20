package org.test.strategy;

/**
 * 不出声
 * Created by lichao on 2017/9/20.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("<< Silence >>");

    }
}
