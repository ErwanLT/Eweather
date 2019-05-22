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
package com.eletutour.eweather.services;

import com.eletutour.eweather.CommonForTest;
import com.eletutour.eweather.LocationIQResponse;
import com.eletutour.eweather.datapoint.ForecastResponse;
import com.eletutour.eweather.datapoint.LocationData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GsonServiceTest extends CommonForTest {


    private String darkskyResponse;

    private String locationIQResponse;

    @Before
    public void setUp(){
        darkskyResponse = com.eletutour.eweather.ForecastResponse.darkSkyResponse;
        locationIQResponse = LocationIQResponse.locationIQResponse;
    }


    @Test
    public void deserializeDarkSkyResponse(){

        ForecastResponse f = gsonService.stringToForecast(darkskyResponse);
        assertThat(f).isNotNull();
        checkForecast(f);

    }

    private void checkForecast(ForecastResponse f) {
        assertThat(f.getLatitude()).isEqualTo(48.8566);
        assertThat(f.getLongitude()).isEqualTo(2.3515);
        assertThat(f.getTimezone()).isEqualTo("Europe/Paris");
        assertThat(f.getCurrently()).isNotNull();
        assertThat(f.getDaily()).isNotNull();
        assertThat(f.getHourly()).isNotNull();
        assertThat(f.getAlerts()).isNotNull();
        //check Currently
        checkToParseCurrently(f.getCurrently());
        //checkDaily
        checkToParseDaily(f.getDaily());
        //
        checkToParseHourly(f.getHourly());
        //
        checkToParseAlerts(f.getAlerts());
    }

    @Test
    public void deserializeLocationIQResponse(){
        LocationData[] l = gsonService.stringToLocations(locationIQResponse);
        assertThat(l).isNotNull();
    }

}
