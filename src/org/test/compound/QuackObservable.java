package org.test.compound;

/**
 * 订阅者 主题
 * Created by lichao on 2018/2/5.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
