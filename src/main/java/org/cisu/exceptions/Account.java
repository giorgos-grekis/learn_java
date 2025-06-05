package org.cisu.exceptions;

public class Account {
    public void deposit(float value) {
        // defencive programming
        if (value <= 0) {
            throw new IllegalArgumentException("Value must be greater than zero");
        }
    }
}
