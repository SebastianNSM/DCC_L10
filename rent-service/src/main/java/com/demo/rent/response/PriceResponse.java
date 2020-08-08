package com.demo.rent.response;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceResponse {
    private final BigDecimal price;

    @JsonCreator
    public PriceResponse(@JsonProperty(value = "price", required = true) BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
