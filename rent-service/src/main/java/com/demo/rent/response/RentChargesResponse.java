package com.demo.rent.response;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RentChargesResponse {

    private final BigDecimal price;

    @JsonCreator
    public RentChargesResponse(@JsonProperty(required = true) BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
