package com.appretice.currencyconverter.domain;

public enum Currency {

    EUR(0.91),
    GBP(0.76),
    CAD(1.28),
    AUD(1.37),
    JPY(115.08),
    CNY(6.35),
    INR(75.28),
    BRL(4.93),
    ZAR(15.68),
    RUB(75.65),
    USD(1);

    private double value;

    Currency(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
