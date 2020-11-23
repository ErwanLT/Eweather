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
package com.eletutour.eweather.controller;


import com.eletutour.eweather.dto.Forecast;
import com.eletutour.eweather.services.interfaces.IWeatherService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Main controller for the {@link com.eletutour.eweather.EweatherApplication} web page
 *
 * @author eletutour
 * @since 1.0.0
 */
@RestController
@RequestMapping("/eweather")
@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
public class WeatherController {

    private final IWeatherService weatherService;

    @Autowired
    public WeatherController(IWeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/forecast")
    @ApiOperation(value = "Get the weather forecast for a location",
            produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "operation created", response = Forecast.class),
            @ApiResponse(code = 500, message = "An error occured")
    }
    )
    @CrossOrigin("https://profile-analyzer.herokuapp.com")
    public Forecast getWeather(@RequestParam(name = "location") String location) throws Exception {
        return weatherService.getForecast(location);
    }

    @GetMapping("/forecastLocation")
    @ApiOperation(value = "Get the weather forecast for the latitude and the longitude",
            produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "operation created", response = Forecast.class),
            @ApiResponse(code = 500, message = "An error occured")
    })
    @CrossOrigin("https://profile-analyzer.herokuapp.com")
    public Forecast getWeather(@RequestParam(name = "latitude")String latitude,
                               @RequestParam(name = "longitude")String longitude) throws Exception{
        return weatherService.getForecast(latitude, longitude);
    }
}
