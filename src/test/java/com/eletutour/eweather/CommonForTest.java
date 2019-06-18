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
package com.eletutour.eweather;

import com.eletutour.eweather.datapoint.DailyData;
import com.eletutour.eweather.datapoint.HourlyData;
import com.eletutour.eweather.form.Alert;
import com.eletutour.eweather.form.Currently;
import com.eletutour.eweather.form.Daily;
import com.eletutour.eweather.form.Hourly;
import com.eletutour.eweather.services.implementations.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class CommonForTest {

    @Autowired
    protected ResponseToFormService service;
    @Autowired
    protected GsonService gsonService;
    @Autowired
    protected WeatherService weatherService;
    @Autowired
    protected ResponseToFormService responseToFormService;
    @Autowired
    protected DarkSkyService darkSkyService;
    @Autowired
    protected LocationIQService locationIQService;
    @Autowired
    protected DateService dateService;

    @Rule
    public final TestRule watchman = new TestWatcher() {
        @Override
        protected void starting(Description description) {
            log.info("==== Start of Test : {} ====", description.getDisplayName());
        }

        @Override
        protected void finished(Description description) {
            log.info("==== End of Test : {} ====", description.getDisplayName());
        }
    };

    protected void checkCurrently(Currently currently) {
        assertThat(currently.getSummary()).isNotNull();
        assertThat(currently.getTime()).isNotNull();
        assertThat(currently.getIcon()).isNotNull();
        assertThat(currently.getTemperature()).isNotNull();
        assertThat(currently.getApparentTemperature()).isNotNull();
        assertThat(currently.getDewPoint()).isNotNull();
        assertThat(currently.getHumidity()).isNotNull();
        assertThat(currently.getPressure()).isNotNull();
        assertThat(currently.getWindSpeed()).isNotNull();
        assertThat(currently.getUvIndex()).isNotNull();
        assertThat(currently.getVisibility()).isNotNull();
        assertThat(currently.getOzone()).isNotNull();

    }

    protected void checkWeek(List<Daily> week) {

        assertThat(week.size()).isEqualTo(8);

        checkDaily(week.get(0));
    }

    protected void checkDaily(Daily daily) {
        assertThat(daily.getId()).isNotNull();
        assertThat(daily.getTime()).isNotNull();
        assertThat(daily.getSummary()).isNotNull();
        assertThat(daily.getIcon()).isNotNull();
        assertThat(daily.getSunriseTime()).isNotNull();
        assertThat(daily.getSunsetTime()).isNotNull();
        assertThat(daily.getTemperatureMax()).isNotNull();
        assertThat(daily.getTemperatureMin()).isNotNull();
        assertThat(daily.getMoonPhase()).isNotNull();
    }


    protected void checkHours(List<Hourly> hours) {
        assertThat(hours.size()).isEqualTo(49);

        checkHour(hours.get(0));
    }

    protected void checkHour(Hourly hourly) {
        assertThat(hourly.getTime()).isNotNull();
        assertThat(hourly.getIcon()).isNotNull();
        assertThat(hourly.getSummary()).isNotNull();
        assertThat(hourly.getTemperature()).isNotNull();
        assertThat(hourly.getApparentTemperature()).isNotNull();
        assertThat(hourly.getPrecipProbability()).isNotNull();
    }

    protected void checkAlerts(List<Alert> alerts) {
        assertThat(alerts.size()).isEqualTo(1);

        checkAlert(alerts.get(0));
    }

    protected void checkAlert(Alert alert) {
        assertThat(alert.getTitle()).isNotNull();
        assertThat(alert.getUri()).isNotNull();
        assertThat(alert.getTime()).isNotNull();
        assertThat(alert.getExpire()).isNotNull();
    }

    protected void checkToParseCurrently(com.eletutour.eweather.datapoint.Currently currently) {
        assertThat(currently.getSummary()).isEqualTo("Breezy and Overcast");
        assertThat(currently.getIcon()).isEqualTo("wind");
        assertThat(currently.getPrecipIntensity()).isNotNull();
        assertThat(currently.getPrecipProbability()).isNotNull();
        assertThat(currently.getTemperature()).isNotNull();
        assertThat(currently.getApparentTemperature()).isNotNull();
        assertThat(currently.getDewPoint()).isNotNull();
        assertThat(currently.getHumidity()).isNotNull();
        assertThat(currently.getPressure()).isNotNull();
        assertThat(currently.getWindSpeed()).isNotNull();
        assertThat(currently.getWindGust()).isNotNull();
        assertThat(currently.getWindBearing()).isNotNull();
        assertThat(currently.getCloudCover()).isNotNull();
        assertThat(currently.getUvIndex()).isNotNull();
        assertThat(currently.getVisibility()).isNotNull();
        assertThat(currently.getOzone()).isNotNull();
    }

    protected void checkToParseDaily(com.eletutour.eweather.datapoint.Daily daily) {
        assertThat(daily.getIcon()).isEqualTo("rain");
        assertThat(daily.getSummary()).isEqualTo("Light rain today and Sunday, with high temperatures bottoming out at 53°F on Sunday.");
        assertThat(daily.getData()).isNotNull();
        assertThat(daily.getData().size()).isEqualTo(8);

        checkDailyData(daily.getData().get(0));
    }

    private void checkDailyData(DailyData dailyData) {
        assertThat(dailyData.getTime()).isNotNull();
        assertThat(dailyData.getSummary()).isEqualTo("Overcast throughout the day and breezy until afternoon.");
        assertThat(dailyData.getIcon()).isEqualTo("wind");
        assertThat(dailyData.getSunriseTime()).isNotNull();
        assertThat(dailyData.getSunsetTime()).isNotNull();
        assertThat(dailyData.getMoonPhase()).isNotNull();
        assertThat(dailyData.getPrecipIntensity()).isNotNull();
        assertThat(dailyData.getPrecipIntensityMax()).isNotNull();
        assertThat(dailyData.getPrecipProbability()).isNotNull();
        assertThat(dailyData.getPrecipIntensityMaxTime()).isNotNull();
        assertThat(dailyData.getPrecipAccumulation()).isNull();
        assertThat(dailyData.getPrecipType()).isNotNull();
        assertThat(dailyData.getTemperatureHigh()).isNotNull();
        assertThat(dailyData.getTemperatureLow()).isNotNull();
        assertThat(dailyData.getApparentTemperatureHigh()).isNotNull();
        assertThat(dailyData.getApparentTemperatureLow()).isNotNull();
        assertThat(dailyData.getTemperatureMin()).isNotNull();
        assertThat(dailyData.getTemperatureMax()).isNotNull();
        assertThat(dailyData.getApparentTemperatureMin()).isNotNull();
        assertThat(dailyData.getApparentTemperatureMax()).isNotNull();
        assertThat(dailyData.getDewPoint()).isNotNull();
        assertThat(dailyData.getHumidity()).isNotNull();
        assertThat(dailyData.getPressure()).isNotNull();
        assertThat(dailyData.getWindSpeed()).isNotNull();
        assertThat(dailyData.getWindGust()).isNotNull();
        assertThat(dailyData.getWindBearing()).isNotNull();
        assertThat(dailyData.getCloudCover()).isNotNull();
        assertThat(dailyData.getUvIndex()).isNotNull();
        assertThat(dailyData.getVisibility()).isNotNull();
        assertThat(dailyData.getOzone()).isNotNull();
        assertThat(dailyData.getTemperatureHighTime()).isNotNull();
        assertThat(dailyData.getTemperatureLowTime()).isNotNull();
        assertThat(dailyData.getApparentTemperatureHighTime()).isNotNull();
        assertThat(dailyData.getApparentTemperatureLowTime()).isNotNull();
        assertThat(dailyData.getTemperatureMinTime()).isNotNull();
        assertThat(dailyData.getTemperatureMaxTime()).isNotNull();
        assertThat(dailyData.getWindGustTime()).isNotNull();
        assertThat(dailyData.getUvIndexTime()).isNotNull();
        assertThat(dailyData.getApparentTemperatureMinTime()).isNotNull();
        assertThat(dailyData.getApparentTemperatureMaxTime()).isNotNull();

    }

    protected void checkToParseHourly(com.eletutour.eweather.datapoint.Hourly hourly) {
        assertThat(hourly.getIcon()).isNotNull();
        assertThat(hourly.getSummary()).isNotNull();
        assertThat(hourly.getData()).isNotNull();
        assertThat(hourly.getData().size()).isEqualTo(49);

        checkHourlyData(hourly.getData().get(0));
    }

    private void checkHourlyData(HourlyData hourlyData) {
        assertThat(hourlyData.getTime()).isNotNull();
        assertThat(hourlyData.getSummary()).isEqualTo("Breezy and Overcast");
        assertThat(hourlyData.getIcon()).isEqualTo("wind");
        assertThat(hourlyData.getPrecipIntensity()).isNotNull();
        assertThat(hourlyData.getPrecipProbability()).isNotNull();
        assertThat(hourlyData.getDewPoint()).isNotNull();
        assertThat(hourlyData.getHumidity()).isNotNull();
        assertThat(hourlyData.getPressure()).isNotNull();
        assertThat(hourlyData.getWindSpeed()).isNotNull();
        assertThat(hourlyData.getWindGust()).isNotNull();
        assertThat(hourlyData.getWindBearing()).isNotNull();
        assertThat(hourlyData.getCloudCover()).isNotNull();
        assertThat(hourlyData.getUvIndex()).isNotNull();
        assertThat(hourlyData.getVisibility()).isNotNull();
        assertThat(hourlyData.getOzone()).isNotNull();
        assertThat(hourlyData.getNearestStormBearing()).isNotNull();
        assertThat(hourlyData.getNearestStormDistance()).isNotNull();
    }

    protected void checkToParseAlerts(List<com.eletutour.eweather.datapoint.Alert> alerts) {
        assertThat(alerts.isEmpty()).isFalse();
        checkToParseAlert(alerts.get(0));
    }

    protected void checkToParseAlert(com.eletutour.eweather.datapoint.Alert alert) {
        assertThat(alert.getTime()).isNotNull();
        assertThat(alert.getExpires()).isNotNull();
        assertThat(alert.getTitle()).isNotNull();
        assertThat(alert.getUri()).isNotNull();
        assertThat(alert.getDescription()).isNotNull();
        assertThat(alert.getSeverity()).isNotNull();
        assertThat(alert.getRegions()).isNotNull();
    }
}
