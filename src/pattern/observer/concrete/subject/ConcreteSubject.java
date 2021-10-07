package pattern.observer.concrete.subject;

import pattern.observer.concrete.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    List<Observer> observers;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer obs) {
        // 옵저버 등록
    }

    @Override
    public void removeObserver(Observer obs) {
        // 옵저버 삭제
    }

    @Override
    public void notifyObservers() {
        // 옵저버에게 알림
    }
}
