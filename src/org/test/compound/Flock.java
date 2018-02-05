package org.test.compound;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 鸭子群
 * Created by lichao on 2018/2/5.
 */
public class Flock implements Quackable {
    ArrayList quckers = new ArrayList();

    public void add(Quackable quackable) {
        quckers.add(quackable);
    }

    @Override
    public void quack() {
        // 让所有鸭子都叫
        Iterator iterator = quckers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }

    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quckers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.registerObserver(observer);
        }

    }

    @Override
    public void notifyObservers() {

    }
}
