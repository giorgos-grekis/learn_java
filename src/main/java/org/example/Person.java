package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private Vehicle[] vehicle;

    public Person() {}

    public Person(String name) {}


    public Person(String name, Vehicle[] vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle[] getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle[] vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicle=" + Arrays.toString(vehicle) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.deepEquals(vehicle, person.vehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(vehicle));
    }
}
