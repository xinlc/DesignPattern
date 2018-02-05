package org.test.compound;

/**
 * 绿头鸭
 * Created by lichao on 2018/2/5.
 */
public class MallardDuck implements Quackable{

    Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();  // 呱呱叫的时候通知观察者
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
