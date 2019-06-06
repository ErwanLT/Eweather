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
import com.eletutour.eweather.services.ResponseToFormService;
import com.eletutour.eweather.services.WeatherService;
import com.eletutour.eweather.utils.MessageHelper;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;


/**
 * Main controller for the {@link com.eletutour.eweather.EweatherApplication} web page
 *
 * @author eletutour
 * @since 1.0.0
 */
@Controller
public class WeatherController {


    private final WeatherService weatherService;


    private final ResponseToFormService responseToForm;

    @Autowired
    public WeatherController(WeatherService weatherService, ResponseToFormService responseToForm){
        this.weatherService = weatherService;
        this.responseToForm = responseToForm;
    }

    @GetMapping("/")
    public String index(Model model) {

        CoordinateForm coordinateForm = new CoordinateForm();
        model.addAttribute(coordinateForm);

        return "help";
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
            ForecastResponse forecast = weatherService.getForecast(coordinateForm.getLocation());
            if ("Fake forecast".equals(forecast.getLocation())){
                MessageHelper.addWarningAttribute(model, "This is a fake response because something bad happened.");
            }

            Forecast f = responseToForm.darkskyResponseToForm(forecast);

            model.addAttribute("forecast", f);
        }

        return "home";
    }
}
