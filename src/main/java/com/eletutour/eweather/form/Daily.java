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
package com.eletutour.eweather.form;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Daily {

    private int id;
    private String time;
    private String summary;
    private String icon;
    private String sunriseTime;
    private String sunsetTime;
    private double moonPhase;
    private int temperatureMin;
    private int temperatureMax;
    private int dewPoint;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private int uvIndex;
    private double visibility;
    private double ozone;
    private double cloudCover;
    private double precipIntensity;
    private double precipProbability;

    public Daily withId(int id){
        this.setId(id);
        return this;
    }

    public Daily withTime(String time){
        this.setTime(time);
        return this;
    }

    public Daily withSummary(String summary){
        this.setSummary(summary);
        return this;
    }

    public Daily withIcon(String icon){
        this.setIcon(icon);
        return this;
    }

    public Daily withSunriseTime(String sunriseTime){
        this.setSunriseTime(sunriseTime);
        return this;
    }

    public Daily withSunsetTime(String sunsetTime){
        this.setSunsetTime(sunsetTime);
        return this;
    }

    public Daily withTemperatureMax(int temperatureMax){
        this.setTemperatureMax(temperatureMax);
        return this;
    }

    public Daily withTemperatureMin(int temperatureMin){
        this.setTemperatureMin(temperatureMin);
        return this;
    }

    public Daily withMoonPhase(double moonPhase){
        this.setMoonPhase(moonPhase);
        return this;
    }
    
    public Daily withDewPoint(int dewPoint){
        this.dewPoint = dewPoint;
        return this;
    }

    public Daily withHumidity(double humidity){
        this.setHumidity(humidity*100);
        return this;
    }

    public Daily withPressure(double pressure){
        this.setPressure(pressure);
        return this;
    }

    public Daily withWindSpeed(double windSpeed){
        this.setWindSpeed(windSpeed);
        return this;
    }

    public Daily withUVIndex(int uvIndex){
        this.setUvIndex(uvIndex);
        return this;
    }

    public Daily withVisibility(double visibility){
        this.setVisibility(visibility);
        return this;
    }

    public Daily withOzone(double ozone){
        this.setOzone(ozone);
        return this;
    }

    public Daily withCloudCover(double cloudCover){
        this.setCloudCover(cloudCover*100);
        return this;
    }

    public Daily withPrecipIntensity(double precipIntensity){
        this.setPrecipIntensity(precipIntensity);
        return this;
    }

    public Daily withPrecipProbability(double precipProbability){
        this.setPrecipProbability(precipProbability);
        return this;
    }
}
