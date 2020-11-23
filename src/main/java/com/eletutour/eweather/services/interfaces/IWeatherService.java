package com.eletutour.eweather.services.interfaces;


import com.eletutour.eweather.dto.Forecast;

/**
 * @author ewanletutour
 * @version 1.0.0
 * @since 1.0.0
 * <p>
 * Weather Service
 */
public interface IWeatherService {

    Forecast getForecast(String location) throws Exception;

    Forecast getForecast(String latitude, String longitude) throws Exception;
}
