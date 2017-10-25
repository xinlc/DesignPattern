package org.test.observer;

/**
 * 观察者
 * Created by lichao on 2017/9/5.
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);

}
