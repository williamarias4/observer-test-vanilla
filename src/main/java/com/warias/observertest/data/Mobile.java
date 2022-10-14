package com.warias.observertest.data;

public class Mobile {
    private String notification;

    public void setNotification(String notification) {
        this.notification = notification;
        pushNotification();
    }

    public void pushNotification() {
        System.out.println(this.notification);
    }
}
