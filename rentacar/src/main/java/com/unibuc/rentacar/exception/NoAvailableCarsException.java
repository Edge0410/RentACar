package com.unibuc.rentacar.exception;

public class NoAvailableCarsException extends RuntimeException {
    public NoAvailableCarsException(String message) {
        super(message);
    }
}
