package com.appretice.currencyconverter.domain;

public enum Currency {

    EUR(0.93),
    GBP(0.80),
    CAD(1.37),
    AUD(1.52),
    JPY(154.15),
    CNY(7.22),
    INR(83.50),
    BRL(5.08),
    ZAR(18.47),
    RUB(91.09),
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
