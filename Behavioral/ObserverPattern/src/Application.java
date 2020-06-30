import observer.CurrentConditionDisplay;
import observer.ForecastDisplay;
import observer.StatisticsDisplay;
import subject.WeatherData;

/**
 * @author preetombhowmik
 */
public class Application {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(100.00, 110, 120);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        //Update no. 1
        weatherData.updateMeasurement(110, 120, 130);
        currentConditionDisplay.display();
        forecastDisplay.display();
        statisticsDisplay.display();

        //Update no. 2
        weatherData.updateMeasurement(210, 220, 230);
        currentConditionDisplay.display();
        forecastDisplay.display();
        statisticsDisplay.display();

        //DeRegister "StatisticsDisplay"
        weatherData.deRegister(statisticsDisplay);
        weatherData.updateMeasurement(310, 320, 330);
        currentConditionDisplay.display();
        forecastDisplay.display();
        //"StatisticsDisplay" will display old data as it is not notified of the updated data pst de-registration
        statisticsDisplay.display();
    }
}
