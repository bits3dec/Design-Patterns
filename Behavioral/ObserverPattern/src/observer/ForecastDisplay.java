package observer;

import subject.Subject;
import subject.WeatherData;

/**
 * @author preetombhowmik
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private Subject subject;
    private double temperature;
    private double currentPressure;
    private double lastPressure;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update(Subject publisher) {
        if(publisher instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) publisher;
            this.temperature = weatherData.getTemperature();
            this.lastPressure = currentPressure;
            this.currentPressure = weatherData.getPressure();
        }
    }

    @Override
    public void display() {
        System.out.println("[[ForecastDisplay]: Temperature: " + temperature + ", " +
                "LastPressure: " + lastPressure + ", " +
                "CurrentPressure: " + currentPressure + "]"
        );
    }
}
