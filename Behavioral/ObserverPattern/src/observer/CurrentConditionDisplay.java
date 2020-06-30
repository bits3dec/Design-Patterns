package observer;


import subject.Subject;
import subject.WeatherData;

/**
 * @author preetombhowmik
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private Subject subject;
    private double temperature;
    private double humidity;
    private double pressure;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update(Subject publisher) {
        if(publisher instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) publisher;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            this.pressure = weatherData.getPressure();
        }
    }

    @Override
    public void display() {
        System.out.println("[CurrentConditionDisplay]: Temperature: " + temperature + ", " +
                "Humidity: " + humidity + ", " +
                "Pressure: " + pressure + "]"
        );
    }
}
