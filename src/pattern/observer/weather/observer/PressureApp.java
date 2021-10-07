package pattern.observer.weather.observer;

import pattern.observer.weather.subject.Subject;
import pattern.observer.weather.subject.WeatherData;

public class PressureApp implements Observer {

    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
    }

    @Override
    public void update(Subject subject) {
        WeatherData weatherData = (WeatherData) subject;
        this.pressure = weatherData.getPressure();
    }
}
