package org.test.observer;

/**
 * 观察者模式
 * 模拟气象站
 *
 * 出版者(subject) + 订阅者(observer) = 观察者模式
 * 观察者模式: 定义了对象之间的一对多依赖,这样一来,当一个对象改变状态时,它的所有依赖着都会受到通知并自动更新。
 *
 * Created by lichao on 2017/9/5.
 */
public class Main {
    public static void main (String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
