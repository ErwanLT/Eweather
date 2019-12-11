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

import com.eletutour.eweather.datapoint.ForecastResponse;
import com.eletutour.eweather.form.CoordinateForm;
import com.eletutour.eweather.form.Forecast;
import com.eletutour.eweather.services.errors.LocationIQException;
import com.eletutour.eweather.services.interfaces.IResponseToFormService;
import com.eletutour.eweather.services.interfaces.IWeatherService;
import com.eletutour.eweather.utils.MessageHelper;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * Main controller for the {@link com.eletutour.eweather.EweatherApplication} web page
 *
 * @author eletutour
 * @since 1.0.0
 */
@Controller
public class WeatherController {


    private final IWeatherService weatherService;


    private final IResponseToFormService responseToForm;

    @Autowired
    public WeatherController(IWeatherService weatherService, IResponseToFormService responseToForm){
        this.weatherService = weatherService;
        this.responseToForm = responseToForm;
    }

    @GetMapping("/")
    public String index(Model model) {

        CoordinateForm coordinateForm = new CoordinateForm();
        model.addAttribute(coordinateForm);

        return "help";
    }

    @GetMapping("/v2")
    public String indexV2(Model model) {

        CoordinateForm coordinateForm = new CoordinateForm();
        model.addAttribute(coordinateForm);

        return "helpV2";
    }

    @GetMapping("/home")
    public String home(Model model){
        CoordinateForm coordinateForm = new CoordinateForm();
        model.addAttribute(coordinateForm);

        return "home";
    }

    @GetMapping("/history")
    public String history(Model model){
        CoordinateForm coordinateForm = new CoordinateForm();
        model.addAttribute(coordinateForm);

        return "history";
    }

    @GetMapping("/help")
    public String help(Model model){
        return index(model);
    }

    @GetMapping("/helpV2")
    public String helpV2(Model model){
        CoordinateForm form = new CoordinateForm();
        model.addAttribute(form);

        return "indications";
    }

    @PostMapping("/getWeather")
    @ApiOperation(value = "get the weather for the given location",
                  response = String.class,
                  produces = "text/html")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "the weather for the given location", response = Forecast.class),
            @ApiResponse(code = 404, message = "Page eaten by a black hole"),
            @ApiResponse(code = 500, message = "Congratulation, you broke the internet")})
    public String getWeather(@ApiParam(value = "A form with the wanted location", required = true) @ModelAttribute("coordinateForm")CoordinateForm coordinateForm, Model model){

        CoordinateForm form = new CoordinateForm();
        model.addAttribute(form);

        if(StringUtils.isEmpty(coordinateForm.getLocation())){
            //should never happened because it's a required field
            MessageHelper.addDangerAttribute(model, "The location field is null or Empty");
        } else {
            ForecastResponse forecast = null;
            try {
                forecast = weatherService.getForecast(coordinateForm.getLocation());

                if ("Fake forecast".equals(forecast.getLocation())){
                    MessageHelper.addWarningAttribute(model, "This is a fake response because something bad happened.");
                }

                Forecast f = responseToForm.darkskyResponseToForm(forecast);

                List<String> hours = new ArrayList<>();
                List<Integer> temperatures = new ArrayList<>();
                List<Integer> apparentTemperatures = new ArrayList<>();

                f.getHours().stream().limit(24).forEach(hourly ->{
                    hours.add(hourly.getTime()+"h");
                    temperatures.add(hourly.getTemperature());
                    apparentTemperatures.add(hourly.getApparentTemperature());
                });

                model.addAttribute("hoursChart", hours);
                model.addAttribute("temperatureChart", temperatures);
                model.addAttribute("apparentTemperatureChart", apparentTemperatures);

                model.addAttribute("forecast", f);
            } catch (LocationIQException e) {
                MessageHelper.addDangerAttribute(model, e.getMessage());
            }
        }

        return "home";
    }

    @PostMapping("/getWeatherV2")
    @ApiOperation(value = "get the weather for the given location",
            response = String.class,
            produces = "text/html")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "the weather for the given location", response = Forecast.class),
            @ApiResponse(code = 404, message = "Page eaten by a black hole"),
            @ApiResponse(code = 500, message = "Congratulation, you broke the internet")})
    public String getWeatherV2(@ApiParam(value = "A form with the wanted location", required = true) @ModelAttribute("coordinateForm")CoordinateForm coordinateForm, Model model){

        CoordinateForm form = new CoordinateForm();
        model.addAttribute(form);

        if(StringUtils.isEmpty(coordinateForm.getLocation())){
            //should never happened because it's a required field
            MessageHelper.addDangerAttribute(model, "The location field is null or Empty");
        } else {
            ForecastResponse forecast = null;
            try {
                forecast = weatherService.getForecast(coordinateForm.getLocation());

                if ("Fake forecast".equals(forecast.getLocation())){
                    MessageHelper.addWarningAttribute(model, "This is a fake response because something bad happened.");
                }

                Forecast f = responseToForm.darkskyResponseToForm(forecast);

                List<Integer> humidity = new ArrayList<>();
                List<Integer> uvIndex = new ArrayList<>();
                List<String> hours = new ArrayList<>();
                List<Integer> temperatures = new ArrayList<>();
                List<Integer> apparentTemperatures = new ArrayList<>();

                f.getHours().stream().limit(24).forEach(hourly ->{
                    hours.add(hourly.getTime()+"h");
                    temperatures.add(hourly.getTemperature());
                    apparentTemperatures.add(hourly.getApparentTemperature());
                });

                model.addAttribute("hoursChart", hours);
                model.addAttribute("temperatureChart", temperatures);
                model.addAttribute("apparentTemperatureChart", apparentTemperatures);

                int h = Double.valueOf(f.getCurrently().getHumidity()).intValue();

                humidity.add(h);
                uvIndex.add(f.getCurrently().getUvIndex());

                model.addAttribute("humidity", humidity);
                model.addAttribute("uvIndex", uvIndex);
                model.addAttribute("currentTemp", f.getCurrently().getTemperature());

                getHoursCarousel(model, f);


                model.addAttribute("forecast", f);
            } catch (LocationIQException e) {
                MessageHelper.addDangerAttribute(model, e.getMessage());
            }
        }

        return "homeV2";
    }

    private void getHoursCarousel(Model model, Forecast f) {
        for (int i=0; i<=8; i++){
            model.addAttribute("hours"+String.valueOf(i), f.getHours().get(i));
        }
    }
}
