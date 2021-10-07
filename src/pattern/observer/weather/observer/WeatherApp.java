package pattern.observer.weather.observer;

import pattern.observer.weather.subject.Subject;
import pattern.observer.weather.subject.WeatherData;

public class WeatherApp implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void update(Subject subject) {
        WeatherData weatherData = (WeatherData) subject;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
    }
}
