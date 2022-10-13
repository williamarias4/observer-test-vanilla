package com.warias.observertest.data;

import com.warias.observertest.Observer;
import com.warias.observertest.Subject;

import java.util.ArrayList;
import java.util.List;

public class Store implements Subject {

    private Mobile mobile = new Mobile();
    private List<Observer> observers = new ArrayList<>();

    public Store() {

    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.mobile;
    }
}
