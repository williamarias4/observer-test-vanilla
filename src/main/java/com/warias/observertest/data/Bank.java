package com.warias.observertest.data;

import com.warias.observertest.Observer;
import com.warias.observertest.Subject;

import java.util.ArrayList;
import java.util.List;

public class Bank implements Subject {

    private Double mainExchangeRate;
    private List<Observer> observers = new ArrayList<>();

    public Bank() {

    }

    public void setMainExchangeRate(Double mainExchangeRate) {
        this.mainExchangeRate = mainExchangeRate;
        notifyObservers();
    }

    public Double getMainExchangeRate() {
        return mainExchangeRate;
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
        String message =  "1 Dollar is at " + this.mainExchangeRate + "CRC";
        for (Observer observer : observers) {
            observer.update(this.mainExchangeRate.toString());
        }
    }

}
