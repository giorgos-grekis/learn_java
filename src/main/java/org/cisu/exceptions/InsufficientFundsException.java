package org.cisu.exceptions;

// Check -> Exception
// Unchecked (runtime) -> RuntimeException

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException() {
        super("Insufficient Funds");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
