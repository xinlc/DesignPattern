package org.test.compound;

/**
 * 鸭鸣器(猎人使用的那种)
 * Created by lichao on 2018/2/5.
 */
public class DuckCall implements Quackable{
    @Override
    public void quack() {
        System.out.println("Kwak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
