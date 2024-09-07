package com.microservices.currency_exchange_service.controller;

import com.microservices.currency_exchange_service.entity.CurrencyExchange;
import com.microservices.currency_exchange_service.exception.CurrencyExchangeNotFoundException;
import com.microservices.currency_exchange_service.model.CurrencyExchangeModel;
import com.microservices.currency_exchange_service.repository.CurrencyExchangeRepository;
import com.microservices.currency_exchange_service.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
    private final CurrencyExchangeService service;

    public CurrencyExchangeController(CurrencyExchangeService service) {
        this.service = service;
    }

    @GetMapping("/currency-exchange")
    public CurrencyExchangeModel get(
            @RequestParam(name = "from") String from,
            @RequestParam(name = "to") String to
    ) {
        return service.findOne(from, to);
    }
}
