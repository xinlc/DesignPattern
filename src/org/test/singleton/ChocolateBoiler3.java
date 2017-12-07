package org.test.singleton;

/**
 * 巧克力工厂
 * 单例多线程同步版
 * Created by lichao on 2017/12/7.
 */
public class ChocolateBoiler3 {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler3 uniqueInstance;

    private ChocolateBoiler3() {
        empty = true;
        boiled = false;
    }

    // 获取唯一实例,加锁避免多线程问题(注意加锁会使程序效率下降100倍!!!)
    public static synchronized ChocolateBoiler3 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler3();
        }
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

