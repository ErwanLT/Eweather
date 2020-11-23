package com.eletutour.eweather.services.interfaces;


import com.eletutour.eweather.dto.Forecast;
import com.eletutour.eweather.dto.LocationData;
import com.eletutour.eweather.exceptions.LocationIssueException;

/**
 * @author ewanletutour
 * @version 1.0.0
 * @since 1.0.0
 * <p>
 * Gson Service
 */
public interface IGsonService {


    LocationData[] stringToLocations(String locationIQResponse) throws LocationIssueException;

    LocationData stringToLocationReverse(String locationIQResponse) throws LocationIssueException;

    Forecast stringToForecast(String darkSkyResponse);
}
