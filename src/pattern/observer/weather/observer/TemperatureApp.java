package pattern.observer.weather.observer;

import pattern.observer.weather.subject.Subject;
import pattern.observer.weather.subject.WeatherData;

public class TemperatureApp implements Observer {

    private float temperature;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
    }

    @Override
    public void update(Subject subject) {
        WeatherData weatherData = (WeatherData) subject;
        this.temperature = weatherData.getTemperature();
    }
}
