package pattern.observer.weather.subject;

import pattern.observer.weather.observer.Observer;

public interface Subject {

    void registerObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();
}
