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
package com.eletutour.eweather.utils;

import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Slf4j
public class ApiUtils {

    public static final String DARK_SKY_KEY = System.getenv("DARKSKY_KEY");

    public static final String DARK_SKY_URL = "https://api.darksky.net/forecast/";

    public static final String DARK_SKY_SI_UNIT = "&units=si";

    public static final String DARK_SKY_LANG = "?lang=fr";

    public static final String DARK_SKY_EXCLUDE = "&exclude=minutely";

    public static final String LOCATIONIQ_KEY = System.getenv("LOCATIONIQ_KEY");

    public static final String LOCATIONIQ_URL1 = "https://eu1.locationiq.com/v1/search.php?key=";

    public static final String LOCATIONIQ_URL2 = "&format=json&accept-language=fr";

    public static String getDarkSkyUrl(String latitude, String longitude){

        return DARK_SKY_URL + DARK_SKY_KEY + "/" + latitude + "," + longitude + DARK_SKY_LANG + DARK_SKY_SI_UNIT + DARK_SKY_EXCLUDE;
    }

    public static String getLocationiqUrl(String location){
        return LOCATIONIQ_URL1 + LOCATIONIQ_KEY + "&q=" + location + LOCATIONIQ_URL2;
    }

    public static String callApiWithUrl(String url) {

        OkHttpClient client = new OkHttpClient();
        try{
            Request request = new Request.Builder()
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();

            return response.body().string();
        } catch (Exception e){
            log.debug("error : ", e);
        }
        return "";
    }
}
