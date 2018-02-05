package org.test.compound;

/**
 * 橡皮鸭
 * Created by lichao on 2018/2/5.
 */
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
