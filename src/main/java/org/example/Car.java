package org.example;

public class Car implements Vehicle {



    private int currentSpeed;

    public Car() {}

    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {
        this.currentSpeed += amount;
        System.out.println("Moving car " + currentSpeed + " km/h");
    }

    @Override
    public void applyBreaks(int amount) {
        this.currentSpeed -= amount;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }


}
