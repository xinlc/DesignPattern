package org.test.observer.pulldata;

/**
 * 基于java提供的观察者模式, 实现拉数据 (不建议使用)
 * Created by lichao on 2017/10/25.
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 60, 29.2f);
    }
}
