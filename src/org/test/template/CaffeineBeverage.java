package org.test.template;

/**
 * 咖啡因饮料
 * Created by lichao on 2017/12/27.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() { // 定义成final,避免被子类覆盖
        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiments())   // 这是一个钩子
            addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
       return true;
    }

}
