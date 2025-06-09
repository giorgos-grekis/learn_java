package org.example.classes;

import java.io.Serializable;
import java.math.BigDecimal;

// POJOS and Java Bean
public class Car implements Serializable {

    private String regNumber;
    private BigDecimal price;

    public Car() {}

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
}
