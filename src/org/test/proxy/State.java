package org.test.proxy;

import java.io.Serializable;

/**
 * Created by lichao on 2018/1/3.
 */
public interface State extends Serializable {
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
