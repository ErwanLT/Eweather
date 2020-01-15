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
import com.eletutour.eweather.form.*;
import com.eletutour.eweather.services.Constants;
import com.eletutour.eweather.services.interfaces.IDateService;
import com.eletutour.eweather.services.interfaces.IResponseToFormService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ResponseToFormService implements IResponseToFormService {


    private final IDateService dateService;

    @Autowired
    public ResponseToFormService(IDateService dateService){
        this.dateService = dateService;
    }

    private String timezone;

    @Override
    public Forecast darkskyResponseToForm(ForecastResponse responseForecast){

        Forecast f = new Forecast();

        timezone = responseForecast.getTimezone();

        f.setLocation(responseForecast.getLocation());

        f.setLat(String.valueOf(responseForecast.getLatitude()));
        f.setLon(String.valueOf(responseForecast.getLongitude()));

        f.setCurrently(getResponseDaily(responseForecast.getCurrently()));
        f.setWeekSummary(responseForecast.getDaily().getSummary());
        f.setHourSummary(responseForecast.getHourly().getSummary());
        f.setHoursIcon(responseForecast.getHourly().getIcon());
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
                .withTime(dateService.dateFromInstant(alert.getTime(), Constants.FORMAT_DD_MM_YYYY_HH_MM, timezone))
                .withExpire(dateService.dateFromInstant(alert.getExpires(), Constants.FORMAT_DD_MM_YYYY_HH_MM, timezone));
            alertsList.add(alert1);
        }
        return alertsList;
    }

    private List<Hourly> getHoursFromApiResponse(com.eletutour.eweather.datapoint.Hourly hourly) {
        List<Hourly> hours = new ArrayList<>();

        int id = 0;

        for (com.eletutour.eweather.datapoint.HourlyData data:
             hourly.getData()) {
            hours.add(new Hourly()
                .withId(id)
                .withTime(dateService.dateFromInstant(data.getTime(), Constants.FORMAT_HH_DD_MM, timezone))
                .withSummary(data.getSummary())
                .withIcon(data.getIcon())
                .withTemperature((int) Math.round(data.getTemperature()))
                .withApparentTemperature((int) Math.round(data.getApparentTemperature()))
                .withPrecipProbability((int) Math.round(data.getPrecipProbability()))
                .withDewPoint((int) Math.round(data.getDewPoint()))
                .withHumidity(data.getHumidity())
                .withPressure(data.getPressure())
                .withWindSpeed(data.getWindSpeed())
                .withUVIndex((int)data.getUvIndex())
                .withVisibility(data.getVisibility())
                .withOzone(data.getOzone())
                .withCloudCover(data.getCloudCover())
                .withPrecipIntensity(data.getPrecipIntensity())
            );

            id = id + 1;
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
                .withOzone(responseForecastCurrently.getOzone())
                .withCloudCover(responseForecastCurrently.getCloudCover())
                .withPrecipIntensity(responseForecastCurrently.getPrecipIntensity());
    }

    private List<Daily> getWeekFromAPIResponse(com.eletutour.eweather.datapoint.Daily daily) {

        List<Daily> week = new ArrayList<>();

        int id = 0;

        for (com.eletutour.eweather.datapoint.DailyData data: daily.getData()) {
            week.add(new Daily()
            .withId(id)
            .withTime(dateService.dateFromInstant(data.getTime(), Constants.FORMAT_D_MMM_YYYY, timezone))
            .withIcon(data.getIcon())
            .withSummary(data.getSummary())
            .withSunriseTime(dateService.dateFromInstant(data.getSunriseTime(), Constants.FORMAT_HH_MM, timezone))
            .withSunsetTime(dateService.dateFromInstant(data.getSunsetTime(), Constants.FORMAT_HH_MM, timezone))
            .withTemperatureMax((int) Math.round(data.getTemperatureMax()))
            .withTemperatureMin((int) Math.round(data.getTemperatureMin()))
            .withMoonPhase(data.getMoonPhase())
            .withDewPoint((int) Math.round(data.getDewPoint()))
            .withHumidity(data.getHumidity())
            .withPressure(data.getPressure())
            .withWindSpeed(data.getWindSpeed())
            .withUVIndex(data.getUvIndex())
            .withVisibility(data.getVisibility())
            .withOzone(data.getOzone())
            .withCloudCover(data.getCloudCover())
            .withPrecipIntensity(data.getPrecipIntensity())
            .withPrecipProbability(data.getPrecipProbability()));

            id = id + 1;
        }

        return week;
    }
}
