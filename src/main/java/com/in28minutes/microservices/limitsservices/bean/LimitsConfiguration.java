package com.in28minutes.microservices.limitsservices.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor @NoArgsConstructor
public class LimitsConfiguration {

    private int maximum;
    private int minimum;
}
