package pattern.observer.concrete.subject;

import pattern.observer.concrete.observer.Observer;

public interface Subject {

    void registerObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();
}
