package com.microservices.currency_conversion_service.proxy;

import com.microservices.currency_conversion_service.model.CurrencyConversionModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "currency-exchange-service")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange")
    CurrencyConversionModel currencyExchange(
        @RequestParam(name = "from") String from,
        @RequestParam(name = "to") String to
    );
}
