package com.warias.observertest;


import java.util.ArrayList;
import java.util.List;

public interface Subject {

    List<Observer> observers = new ArrayList<>();

    void register(Observer observer);

    void unregister(Observer sub);

    void notifyObservers();

    Object getUpdate(Observer observer);

}
