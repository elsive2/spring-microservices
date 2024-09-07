package com.microservices.currency_exchange_service.service;

import com.microservices.currency_exchange_service.entity.CurrencyExchange;
import com.microservices.currency_exchange_service.exception.CurrencyExchangeNotFoundException;
import com.microservices.currency_exchange_service.model.CurrencyExchangeModel;
import com.microservices.currency_exchange_service.repository.CurrencyExchangeRepository;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {
    private final CurrencyExchangeRepository repository;
    private final Environment environment;

    public CurrencyExchangeService(CurrencyExchangeRepository repository, Environment environment) {
        this.repository = repository;
        this.environment = environment;
    }

    public CurrencyExchangeModel findOne(String from, String to) {
        CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);

        if (currencyExchange == null) {
            throw new CurrencyExchangeNotFoundException();
        }

        CurrencyExchangeModel response = new CurrencyExchangeModel();
        response.setFrom(currencyExchange.getFrom());
        response.setTo(currencyExchange.getTo());
        response.setId(currencyExchange.getId());
        response.setConversionMultiple(currencyExchange.getConversionMultiple());

        String port = environment.getProperty("local.server.port");
        response.setEnvironment(port);

        return response;
    }
}
