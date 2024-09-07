package com.microservices.currency_exchange_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "currency_exchange_not_found")
public class CurrencyExchangeNotFoundException extends RuntimeException {
}
