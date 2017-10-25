package org.test.observer.pulldata;


import java.util.Observable;

/**
 * Created by lichao on 2017/10/25.
 */
public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humi, float pres) {
        this.temperature = temp;
        this.humidity = humi;
        this.pressure = pres;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
