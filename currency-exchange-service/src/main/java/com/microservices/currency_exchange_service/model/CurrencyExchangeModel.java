package com.microservices.currency_exchange_service.model;

import java.math.BigDecimal;

public class CurrencyExchangeModel {
    private Long id;
    private String from;
    private String to;
    private Double conversionMultiple;
    private String environment;

    public CurrencyExchangeModel() { }

    public CurrencyExchangeModel(Long id, String from, String to, double conversionMultiple, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Double getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(Double conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
