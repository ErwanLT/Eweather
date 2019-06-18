package com.eletutour.eweather.services.interfaces;

import com.eletutour.eweather.datapoint.ForecastResponse;

public interface IWeatherService {

    ForecastResponse getForecast(String location);

    ForecastResponse getForecast(String latitude, String longitude, String location);
}
