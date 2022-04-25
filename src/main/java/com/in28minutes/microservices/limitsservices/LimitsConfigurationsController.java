package com.in28minutes.microservices.limitsservices;

import com.in28minutes.microservices.limitsservices.bean.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationsController {

    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations(){
        return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
