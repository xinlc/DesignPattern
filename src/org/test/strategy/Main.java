package org.test.strategy;

/**
 * 策略模式
 * 模拟鸭子的行为,飞或叫
 *
 * 策略模式: 定义了算法族,分别封装起来,让他们之间可以互相依赖,此模式让算法的变化独立于使用算法的客户
 * Created by lichao on 2017/9/20.
 */
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
