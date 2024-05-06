package com.appretice.currencyconverter.dto;

public class ConvertItem {

    private Money from;
    private Money to;

    public ConvertItem(Money from, Money to) {
        this.from = from;
        this.to = to;
    }

    public Money getFrom() {
        return from;
    }

    public void setFrom(Money from) {
        this.from = from;
    }

    public Money getTo() {
        return to;
    }

    public void setTo(Money to) {
        this.to = to;
    }
}
