package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author preetombhowmik
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData(double temperature, double humidity, double pressure) {
        this.observers = new ArrayList<>();
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deRegister(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyUsers() {
        observers.forEach(o -> o.update(this));
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void updateMeasurement(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyUsers();
    }
}
