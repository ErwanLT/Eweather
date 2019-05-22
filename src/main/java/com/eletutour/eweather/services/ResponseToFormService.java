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

import com.eletutour.eweather.datapoint.ForecastResponse;
import com.eletutour.eweather.form.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ResponseToFormService {


    private final DateService dateService;

    @Autowired
    public ResponseToFormService(DateService dateService){
        this.dateService = dateService;
    }

    private String timezone;

    public Forecast darkskyResponseToForm(ForecastResponse responseForecast){

        Forecast f = new Forecast();

        timezone = responseForecast.getTimezone();

        f.setLocation(responseForecast.getLocation());
        f.setCurrently(getResponseDaily(responseForecast.getCurrently()));

        f.setWeekSummary(responseForecast.getDaily().getSummary());
        f.setHourSummary(responseForecast.getHourly().getSummary());
        f.setWeek(getWeekFromAPIResponse(responseForecast.getDaily()));
        f.setHours(getHoursFromApiResponse(responseForecast.getHourly()));
        f.setAlerts(getAlertsFromApiResponse(responseForecast.getAlerts()));

        return f;

    }

    private List<Alert> getAlertsFromApiResponse(List<com.eletutour.eweather.datapoint.Alert> alerts) {
        List<Alert> alertsList = new ArrayList<>();

        for (com.eletutour.eweather.datapoint.Alert alert : alerts) {
            Alert alert1 = new Alert()
                .withTitle(alert.getTitle())
                .withUri(alert.getUri())
                .withTime(dateService.dateFromInstant(alert.getTime(), dateService.FORMAT_DD_MM_YYYY_HH_MM, timezone))
                .withExpire(dateService.dateFromInstant(alert.getExpires(), dateService.FORMAT_DD_MM_YYYY_HH_MM, timezone));
            alertsList.add(alert1);
        }
        return alertsList;
    }

    private List<Hourly> getHoursFromApiResponse(com.eletutour.eweather.datapoint.Hourly hourly) {
        List<Hourly> hours = new ArrayList<>();

        for (com.eletutour.eweather.datapoint.HourlyData data:
             hourly.getData()) {
            hours.add(new Hourly()
                .withTime(dateService.dateFromInstant(data.getTime(), dateService.FORMAT_DD_MM_YYYY_HH, timezone))
                .withSummary(data.getSummary())
                .withIcon(data.getIcon())
                .withTemperature((int) Math.round(data.getTemperature()))
                .withApparentTemperature((int) Math.round(data.getApparentTemperature()))
                .withPrecipProbability((int) Math.round(data.getPrecipProbability())));
        }
        return hours;
    }


    private Currently getResponseDaily(com.eletutour.eweather.datapoint.Currently responseForecastCurrently) {

        return new Currently()
                .withTime(responseForecastCurrently.getTime())
                .withSummary(responseForecastCurrently.getSummary())
                .withIcon(responseForecastCurrently.getIcon())
                .withTemperature((int) Math.round(responseForecastCurrently.getTemperature()))
                .withApparentTemperature((int) Math.round(responseForecastCurrently.getApparentTemperature()))
                .withDewPoint((int) Math.round(responseForecastCurrently.getDewPoint()))
                .withHumidity(responseForecastCurrently.getHumidity())
                .withPressure(responseForecastCurrently.getPressure())
                .withWindSpeed(responseForecastCurrently.getWindSpeed())
                .withUVIndex((int)responseForecastCurrently.getUvIndex())
                .withVisibility(responseForecastCurrently.getVisibility())
                .withOzone(responseForecastCurrently.getOzone());
    }

    private List<Daily> getWeekFromAPIResponse(com.eletutour.eweather.datapoint.Daily daily) {

        List<Daily> week = new ArrayList<>();

        int id = 0;

        for (com.eletutour.eweather.datapoint.DailyData data: daily.getData()) {
            week.add(new Daily()
            .withId(id)
            .withTime(dateService.dateFromInstant(data.getTime(), dateService.FORMAT_D_MMM_YYYY, timezone))
            .withIcon(data.getIcon())
            .withSummary(data.getSummary())
            .withSunriseTime(dateService.dateFromInstant(data.getSunriseTime(), dateService.FORMAT_HH_MM, timezone))
            .withSunsetTime(dateService.dateFromInstant(data.getSunsetTime(), dateService.FORMAT_HH_MM, timezone))
            .withTemperatureMax((int) Math.round(data.getTemperatureMax()))
            .withTemperatureMin((int) Math.round(data.getTemperatureMin()))
            .withMoonPhase(data.getMoonPhase()));

            id = id + 1;
        }

        return week;
    }
}
