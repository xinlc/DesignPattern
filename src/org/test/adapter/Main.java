package org.test.adapter;

/**
 * 适配器模式
 * 适配器模式: 将一个类的接口,转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。
 *
 * 外观模式(Facade Pattern): 提供了一个统一的接口,用来访问子系统中的一群接口。 外观定义了一个高层接口,让子系统更容易使用。
 *
 * 设计原则:
 * 最少知识原则/得墨忒耳法则(Law of Demeter)
 *
 * 1. 模拟火鸡适配鸭子接口
 * 2. 模拟家庭影院
 * Created by licha on 2017/12/27.
 */
public class Main {
    public static void main(String[] args) {
        // 适配器测试
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says....");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says....");
        testDuck(duck);

        System.out.println("The TurkeyAdapter says....");
        testDuck(turkeyAdapter);



        // 外观测试, 伪代码
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(/*amp, dvd*/);
        homeTheater.watchMovie("Raiders of the Lost Ark");
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
