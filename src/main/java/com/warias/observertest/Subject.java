package com.warias.observertest;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public interface Subject {

    List<Observer> observers = new ArrayList<>();

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

    Object getUpdate(Observer observer);

}
