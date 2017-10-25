package org.test.observer;

import java.util.ArrayList;

/**
 * 气象数据
 * Created by lichao on 2017/10/25.
 */
public class WeatherData implements Subject {

    private ArrayList obserers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
       obserers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        obserers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = obserers.indexOf(o);
        if (i >= 0) {
            obserers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
       for (int i = 0; i < obserers.size(); i++) {
           Observer observer = (Observer) obserers.get(i);
           observer.update(temperature, humidity, pressure);
       }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temp, float humi, float pres) {
        this.temperature = temp;
        this.humidity = humi;
        this.pressure = pres;
        measurementsChanged();
    }
}
