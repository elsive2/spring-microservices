package com.microservices.currency_conversion_service.controller;

import com.microservices.currency_conversion_service.model.CurrencyConversionModel;
import com.microservices.currency_conversion_service.service.CurrencyConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

    private final CurrencyConversionService service;

    public CurrencyConversionController(CurrencyConversionService service) {
        this.service = service;
    }

    @GetMapping("/currency-conversion")
    public CurrencyConversionModel currencyConversion(
            @RequestParam(name = "from") String from,
            @RequestParam(name = "to") String to,
            @RequestParam(name = "amount") Integer amount
    ) {
        return service.calculateCurrencyConversion(from, to, amount);
    }
}
