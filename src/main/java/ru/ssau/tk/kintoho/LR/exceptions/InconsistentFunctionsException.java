package ru.ssau.tk.kintoho.LR.exceptions;

public class InconsistentFunctionsException extends RuntimeException {
    public InconsistentFunctionsException() {
        super();
    }

    public InconsistentFunctionsException(String message) {
        super(message);
    }
}