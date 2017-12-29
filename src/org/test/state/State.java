package org.test.state;

/**
 * Created by lichao on 2017/12/29.
 */
public interface State {
    /**
     * 加入投币
     */
    public void insertQuarter();

    /**
     * 退币
     */
    public void ejectQuarter();

    /**
     * 转动曲柄
     */
    public void turnCrank();

    /**
     * 发放糖果
     */
    public void dispense();
}
