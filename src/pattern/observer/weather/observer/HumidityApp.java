package pattern.observer.weather.observer;

import pattern.observer.weather.subject.Subject;
import pattern.observer.weather.subject.WeatherData;

public class HumidityApp implements Observer {

    private float humidity;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
    }

    @Override
    public void update(Subject subject) {
        WeatherData weatherData = (WeatherData) subject;
        this.humidity = weatherData.getHumidity();
    }
}
