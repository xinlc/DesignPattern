package org.test.singleton;

/**
 * 巧克力工厂
 * 单例-双重检查加锁 (JDK版本1.4以上)
 * Created by lichao on 2017/12/7.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // 获取唯一实例
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
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

