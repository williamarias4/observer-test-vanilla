package com.warias.observertest.data;

import com.warias.observertest.Observer;

public class User implements Observer {

    private String name;

    @Override
    public void update() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
