package org.example.classes;

import java.math.BigDecimal;
import java.util.Objects;

public class CarEx {
    private String car;
    private CarBrandEx carBrand;
    private BigDecimal price;

    public CarBrandEx getCarBrand() {
        return carBrand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarEx carEx = (CarEx) o;
        return Objects.equals(car, carEx.car) && carBrand == carEx.carBrand && Objects.equals(price, carEx.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, carBrand, price);
    }

    @Override
    public String toString() {
        return "CarEx{" +
                "car='" + car + '\'' +
                ", carBrand=" + carBrand +
                ", price=" + price +
                '}';
    }

    public CarEx(String car, CarBrandEx carBrand, BigDecimal price) {
        this.car = car;
        this.carBrand = carBrand;
        this.price = price;
    }

    public void setCarBrand(CarBrandEx carBrand) {
        this.carBrand = carBrand;
    }

    public CarEx(String car, BigDecimal price) {
        this.car = car;
        this.price = price;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
