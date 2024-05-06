package com.appretice.currencyconverter.service;

import com.appretice.currencyconverter.dto.ConvertItem;
import com.appretice.currencyconverter.dto.Money;
import org.springframework.stereotype.Service;

@Service
public class ChangeService {


    public ConvertItem convert(Double amount, String to) {
        Money from = new Money(amount,"USD");
        Double convertedItem =  amount * 0.93;
        Money result = new Money(convertedItem, "EUR");
        return new ConvertItem(from, result);
    }
}
