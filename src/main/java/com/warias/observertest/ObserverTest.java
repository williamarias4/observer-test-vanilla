package com.warias.observertest;

import com.warias.observertest.data.ExchangeRate;
import com.warias.observertest.data.Mobile;
import com.warias.observertest.data.Bank;
import com.warias.observertest.data.User;

public class ObserverTest {
    public static void main(String[] args) {

        User user1 = new User("William");
        User user2 = new User("Esteban");
        User user3 = new User("Bongo");
        Bank bank = new Bank();

        bank.register(user1);
        bank.register(user2);
        bank.register(user3);

        bank.setMainExchangeRate(650.12);
        System.out.println("------------------------------------------");
        bank.setMainExchangeRate(632.50);
        System.out.println("------------------------------------------");
        bank.unregister(user2);
        bank.setMainExchangeRate(632.50);

    }
}
