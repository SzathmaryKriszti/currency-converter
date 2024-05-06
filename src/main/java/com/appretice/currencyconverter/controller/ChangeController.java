package com.appretice.currencyconverter.controller;

import com.appretice.currencyconverter.dto.ConvertItem;
import com.appretice.currencyconverter.service.ChangeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChangeController {

    private ChangeService changeService;

    public ChangeController(ChangeService changeService) {
        this.changeService = changeService;
    }

    @GetMapping("/convert")
    public ResponseEntity<ConvertItem> convert(@RequestParam Double amount, String to){
        return new ResponseEntity<>(changeService.convert(amount,to), HttpStatus.OK);
    }

}
