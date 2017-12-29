package org.test.state;

/**
 * 状态模式:
 * 允许对象在内部状态改变时改变它的行为,对象看起来好像修改了它的类。
 *
 * 模拟糖果售货机
 * 10%几率中一颗
 * Created by lichao on 2017/12/29.
 */
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();


        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

    }
}
