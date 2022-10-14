package com.warias.observertest.data;

import java.util.Currency;

public class ExchangeRate {

    private String currency;
    private Double rate;

    public ExchangeRate() {

    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency(){
        return this.currency;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return this.rate;
    }
}
