package com.warias.observertest;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

}
