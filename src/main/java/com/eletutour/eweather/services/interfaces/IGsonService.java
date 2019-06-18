package com.eletutour.eweather.services.interfaces;

import com.eletutour.eweather.datapoint.ForecastResponse;
import com.eletutour.eweather.datapoint.LocationData;


public interface IGsonService {

    ForecastResponse stringToForecast(String darkSkyResponse);

    LocationData[] stringToLocations(String locationIQResponse);
}
