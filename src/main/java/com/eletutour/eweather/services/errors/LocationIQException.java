package com.eletutour.eweather.services.errors;

public class LocationIQException extends Exception {

    public LocationIQException(String errorMessage){
        super(errorMessage);
    }
}
