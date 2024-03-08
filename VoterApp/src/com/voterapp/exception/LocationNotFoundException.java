package com.voterapp.exception;

public class LocationNotFoundException extends NotEligibleException{
    public LocationNotFoundException() {

    }

    public LocationNotFoundException(String message) {
        super(message);
    }
}
