package com.eletutour.eweather.services.interfaces;

import com.eletutour.eweather.datapoint.ForecastResponse;
import com.eletutour.eweather.services.errors.LocationIQException;

public interface IWeatherService {

    ForecastResponse getForecast(String location) throws LocationIQException;

    ForecastResponse getForecast(String latitude, String longitude, String location);
}
