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

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Service
@Slf4j
public class DateService {


    public static final String FORMAT_DD_MM_YYYY = "dd/MM/yyyy";

    public static final String FORMAT_DD_MM_YYYY_HH_MM = "dd/MM/yyyy hh:mm";

    public static final String FORMAT_DD_MM_YYYY_HH = "dd/MM/yyyy HH";

    public static final String FORMAT_HH_MM = "hh:mm";

    public static final String FORMAT_EEEE_D_MMM_YYYY = "EEEE, d MMM yyyy";

    public static final String FORMAT_D_MMM_YYYY = "d MMM yyyy";

    public String dateFromInstant(String time, String format, String zoneId){

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(format);

        ZoneId zone = ZoneId.of(zoneId);

        long unixTime = Long.parseLong(time);
        String formattedDtm = Instant.ofEpochSecond(unixTime)
                .atZone(zone)
                .format(formatter);

        return formattedDtm;
    }
}
