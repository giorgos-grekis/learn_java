package org.example;

public interface Vehicle {
    // constants
    double PURCHASE_RATE = 0.5;

    // abstract methods
    void move(int amount);

    void applyBreaks(int amount);

     int getCurrentSpeed();


    // default methods
    // default is not an abstract method
    default double milesToKm() {
       return getCurrentSpeed() * 1.609344;
    };

    // also static methods

}
