package design.pattern.ch18.observer;

import java.util.ArrayList;
import java.util.List;

public class Members implements Subject {
    private List<Observer> observerList;

    public Members() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observerList.forEach(Observer::update);
    }
}
