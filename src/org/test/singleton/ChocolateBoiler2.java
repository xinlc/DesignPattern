package org.test.singleton;

/**
 * 巧克力工厂
 * 单例急切版
 * Created by lichao on 2017/12/7.
 */
public class ChocolateBoiler2 {
    private boolean empty;
    private boolean boiled;

    // 马上创建实例,避免线程安全问题
    private static ChocolateBoiler2 uniqueInstance = new ChocolateBoiler2();

    private ChocolateBoiler2() {
        empty = true;
        boiled = false;
    }

    public static  ChocolateBoiler2 getInstance() {
        return uniqueInstance;
    }

    // 在锅炉内填满巧克力和牛奶混合物
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    // 排出煮沸的巧克力和牛奶
    public void drain() {
        if (!isEmpty() && isBoiled()) {
           empty = true;
        }
    }

    // 将炉内物煮沸
    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

