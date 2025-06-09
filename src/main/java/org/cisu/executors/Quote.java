package org.cisu.executors;

import java.math.BigDecimal;

public class Quote {
    private final String site;
    private final BigDecimal price;

    public Quote(String site, BigDecimal price) {
        this.site = site;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "site='" + site + '\'' +
                ", price=" + price +
                '}';
    }

    public String getSite() {
        return site;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
