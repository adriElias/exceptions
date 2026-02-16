package org.exceptions;

public class EmptySaleException extends RuntimeException {
    public EmptySaleException() {
        super("For a sale first you have to add products.");
    }
}
