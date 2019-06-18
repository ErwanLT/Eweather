/*-
 * ========================LICENSE_START=================================
 * EWeather
 * ======================================================================
 * Copyright (C) 2018 - 2019 Erwan Le Tutour
 * ======================================================================
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =========================LICENSE_END==================================
 */
package com.eletutour.eweather.services.implementations;

import com.eletutour.eweather.datapoint.ForecastResponse;
import com.eletutour.eweather.datapoint.LocationData;
import com.eletutour.eweather.services.errors.LocationError;
import com.eletutour.eweather.services.errors.LocationIQException;
import com.eletutour.eweather.services.interfaces.IGsonService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GsonService implements IGsonService {

    @Override
    public ForecastResponse stringToForecast(String darkSkyResponse){
        Gson g = new Gson();

        return g.fromJson(darkSkyResponse, ForecastResponse.class);

    }

    @Override
    public LocationData[] stringToLocations(String locationIQResponse) throws LocationIQException {
        Gson g = new Gson();
        if(locationIQResponse.contains("error")){
            LocationError error = g.fromJson(locationIQResponse, LocationError.class);
            throw new LocationIQException(error.getError());
        }
        return g.fromJson(locationIQResponse, LocationData[].class);
    }
}
