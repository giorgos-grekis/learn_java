package org.example.classes;

import java.util.Arrays;
import java.util.Objects;

public class PersonEx {
    private String name;
    private int age;
    private AddressEx address;
    private String cars;
    private CarEx[] car;

    public PersonEx(String name,
                    int age,
                    AddressEx address,
                    CarEx[] car) {
        this.name = name;
        this.age = age;
        this.address = address;

        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AddressEx getAddress() {
        return address;
    }

    public void setAddress(AddressEx address) {
        this.address = address;
    }

    public String getCars() {
        return cars;
    }

    public void setCars(String cars) {
        this.cars = cars;
    }

    public CarEx[] getCar() {
        return car;
    }

    public void setCar(CarEx[] car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEx personEx = (PersonEx) o;
        return age == personEx.age && Objects.equals(name, personEx.name) && Objects.equals(address, personEx.address) && Objects.equals(cars, personEx.cars) && Objects.deepEquals(car, personEx.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, cars, Arrays.hashCode(car));
    }

    @Override
    public String toString() {
        return "PersonEx{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", cars='" + cars + '\'' +
                ", car=" + Arrays.toString(car) +
                '}';
    }
}
