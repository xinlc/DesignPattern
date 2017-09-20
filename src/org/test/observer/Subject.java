package org.test.observer;


/**
 * Created by lichao on 2017/9/5.
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();




}
