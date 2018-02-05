package org.test.compound;

/**
 * 模拟器
 * 1. 实现鸭子叫
 * 2. 实现鸭子叫鹅也跟着叫(利用适配器模式, 鹅适配成鸭子)
 * 3. 记录鸭子呱呱叫的次数(利用装饰器模式)
 * 4. 避免需要写很多包装,将创建鸭子的程序集中在一个地方处理(工厂模式)
 * 5. 实现管理一群鸭子,下一次命令就能让整个集合的鸭子听命令(组合模式)
 * 6. 实现观察个别鸭子的行为(观察者模式)
 * Created by lichao on 2018/2/5.
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
//        simulator.simulator();
//        simulator.simulator(duckFactory);
        simulator.simulatorObserver(duckFactory);

    }

    void simulator() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());

        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Abstract Factory");

        simulator(mallardDuck);
        simulator(redheadDuck);
        simulator(duckCall);
        simulator(rubberDuck);
        simulator(gooseDuck);

        System.out.println("The ducks quacked " +
                            QuackCounter.getQuacks() + " times");

    }

    void simulator(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Quackable gooseDuck = new GooseAdapter(new Goose());

//        System.out.println("\nDuck Simulator: With Goose Adapter");
        System.out.println("\nDuck Simulator: With Composite - Flocks");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        // 创建绿头鸭子小家族
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulator(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulator(flockOfMallards);

        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");

    }

    void simulatorObserver(AbstractDuckFactory duckFactory) {
        /**
         * 观察者模式要理解 主题和观察者
         * 这里鸭子就是主题, quackologist 是观察者
         * 观察者注册到主题 —> 主题叫完通知观察者
         */

        Quackable mallardOne = duckFactory.createMallardDuck();
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardOne);

        System.out.println("\nDuck Simulator: With Observer");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulator(flockOfDucks);

        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");

    }

    void simulator(Quackable duck) {
        duck.quack();
    }
}
