package org.test.template;

/**
 * 模板方法模式:
 * 在一个方法中定义一个算法的骨架,而将一些步骤延迟到子类中。
 * 模板方法使得子类可以在不改变算法结构的情况下,重新定义算法中的某些步骤。
 *
 * 设计原则: 好莱坞原则
 * 别调用(打电话给)我们,我们会调用(打电话给)你。防止依赖腐败,高层组件调用底层,底层组件不可以调用高层。
 *
 * 模拟泡茶和冲咖啡
 * Created by lichao on 2017/12/27.
 */
public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

    }
}
