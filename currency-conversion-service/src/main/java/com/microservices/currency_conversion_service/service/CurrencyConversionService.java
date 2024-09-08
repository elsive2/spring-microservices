package com.microservices.currency_conversion_service.service;

import com.microservices.currency_conversion_service.model.CurrencyConversionModel;
import com.microservices.currency_conversion_service.proxy.CurrencyExchangeProxy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CurrencyConversionService {
    private final CurrencyExchangeProxy currencyExchangeProxy;

    public CurrencyConversionService(CurrencyExchangeProxy currencyExchangeProxy) {
        this.currencyExchangeProxy = currencyExchangeProxy;
    }

    public CurrencyConversionModel calculateCurrencyConversion(String from, String to, Integer amount) {
        CurrencyConversionModel currencyConversionModel = currencyExchangeProxy.currencyExchange(from, to);
        currencyConversionModel.setQuantity(amount);
        currencyConversionModel.setTotalCalculatedAmount(amount * currencyConversionModel.getConversionMultiple());

        return currencyConversionModel;
    }
}
