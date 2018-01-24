package com.degiro;

import java.math.BigDecimal;

public class PriceParameters {

    private static final BigDecimal SELLING_PRICE = BigDecimal.TEN;

    public static BigDecimal getSellingPrice() {
        return SELLING_PRICE;
    }
}
