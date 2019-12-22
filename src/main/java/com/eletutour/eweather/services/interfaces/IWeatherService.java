package com.eletutour.eweather.services.interfaces;

import com.eletutour.eweather.datapoint.ForecastResponse;
import com.eletutour.eweather.services.errors.LocationIQException;

import java.util.Date;

public interface IWeatherService {

    ForecastResponse getForecast(String location) throws LocationIQException;

    ForecastResponse getForecast(String location, Date date) throws LocationIQException;

    ForecastResponse getForecast(String latitude, String longitude, String location);
}
