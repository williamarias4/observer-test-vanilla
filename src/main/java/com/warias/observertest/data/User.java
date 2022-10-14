package com.warias.observertest.data;

import com.warias.observertest.Observer;

public class User implements Observer {

    private String name;
    private Mobile mobile = new Mobile();

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Object message) {
        String notification = "Hello " + this.name + " the Dollar is at " + message + "CRC";
        mobile.setNotification(notification);
    }

}
