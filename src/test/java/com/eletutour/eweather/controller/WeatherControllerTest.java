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

import com.eletutour.eweather.CommonForTest;
import com.eletutour.eweather.ForecastResponse;
import com.eletutour.eweather.LocationIQResponse;
import com.eletutour.eweather.form.CoordinateForm;
import com.eletutour.eweather.form.Forecast;
import com.eletutour.eweather.services.implementations.*;
import com.eletutour.eweather.utils.Message;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ComponentScan("com.myApp.weather")
public class WeatherControllerTest extends CommonForTest {

    @Autowired
    WeatherController weatherController;

    CoordinateForm form;

    @Before
    public void setUp(){
        gsonService = new GsonService();
        darkSkyService = mock(DarkSkyService.class);
        locationIQService = mock(LocationIQService.class);
        dateService = new DateService();
        weatherService = new WeatherService(gsonService, darkSkyService, locationIQService);
        responseToFormService = new ResponseToFormService(dateService);
        weatherController = new WeatherController(weatherService, responseToFormService);
    }

    @Test
    public void testLocationEmpty() {
        Model model = new BindingAwareModelMap();
        form = initFormEmptyLocation();
        this.weatherController.getWeather(form, model);
        assertTrue(model.containsAttribute("message"));
        Message message = (Message) ((BindingAwareModelMap) model).get("message");
        assertThat(message.getMessage()).isEqualTo("The location field is null or Empty");
        assertThat(message.getType()).isEqualTo("DANGER");
    }

    private CoordinateForm initFormEmptyLocation() {
        CoordinateForm form = new CoordinateForm();
        form.setLocation("");
        assertThat(form).isNotNull();
        assertThat(form.getLocation()).isEmpty();

        return form;
    }

    @Test
    public void testResponse() {
        when(locationIQService.callApi(anyString())).thenReturn(LocationIQResponse.locationIQResponse);
        when(darkSkyService.callApi(anyString(), anyString())).thenReturn(ForecastResponse.darkSkyResponse);

        Model model = new BindingAwareModelMap();
        form = initForm();
        this.weatherController.getWeather(form, model);

        assertFalse(model.containsAttribute("message"));

        Forecast f = (Forecast) ((BindingAwareModelMap) model).get("forecast");
        assertThat(f).isNotNull();

        checkCurrently(f.getCurrently());
        checkWeek(f.getWeek());
        checkHours(f.getHours());
        checkAlerts(f.getAlerts());
    }

    private CoordinateForm initForm(){
        CoordinateForm form = new CoordinateForm();
        form.setLocation("Paris");
        assertThat(form).isNotNull();
        assertThat(form.getLocation()).isEqualTo("Paris");

        return form;
    }

    @Test
    public void testFakeResponse(){
        when(locationIQService.callApi(anyString())).thenReturn("");

        Model model = new BindingAwareModelMap();
        form = initForm();

        this.weatherController.getWeather(form, model);
        assertTrue(model.containsAttribute("message"));
        Message message = (Message) ((BindingAwareModelMap) model).get("message");
        assertThat(message.getMessage()).isEqualTo("This is a fake response because something bad happened.");
        assertThat(message.getType()).isEqualTo("WARNING");

        Forecast f = (Forecast) ((BindingAwareModelMap) model).get("forecast");
        assertThat(f).isNotNull();
        assertThat(f.getLocation()).isNotNull();
        checkCurrently(f.getCurrently());
        checkWeek(f.getWeek());
        checkHours(f.getHours());
        checkAlerts(f.getAlerts());
    }
}
