package com.appretice.currencyconverter.service;

import com.appretice.currencyconverter.domain.Currency;
import com.appretice.currencyconverter.dto.ConvertItem;
import com.appretice.currencyconverter.dto.Money;
import org.springframework.stereotype.Service;

@Service
public class ChangeService {


    public ConvertItem convert(Double amount, Currency from, Currency to) {
        Money baseMoney = new Money(amount, from);
        double convertedItem = 0.0;

        convertedItem = (amount * to.getValue()) / from.getValue();

        Money result = new Money(convertedItem, to);
        return new ConvertItem(baseMoney, result);
    }
}
