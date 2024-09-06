package com.microservices.limits_service.controller;

import com.microservices.limits_service.Configuration;
import com.microservices.limits_service.model.LimitsModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private final Configuration config;

    public LimitsController(Configuration config) {
        this.config = config;
    }

    @GetMapping("/limits")
    public LimitsModel retrieveLimits() {
        return new LimitsModel(config.getMin(), config.getMax());
    }
}
