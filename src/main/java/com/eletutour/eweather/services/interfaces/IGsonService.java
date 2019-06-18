package com.eletutour.eweather.services.interfaces;

import com.eletutour.eweather.datapoint.ForecastResponse;
import com.eletutour.eweather.datapoint.LocationData;
import com.eletutour.eweather.services.errors.LocationIQException;


public interface IGsonService {

    ForecastResponse stringToForecast(String darkSkyResponse);

    LocationData[] stringToLocations(String locationIQResponse) throws LocationIQException;
}
