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

public class LocationIQResponse {

    public static final String locationIQResponse = new StringBuilder().append(
            "[\n"+
            "    {\n"+
            "        \"place_id\": \"218751965\",\n"+
            "        \"licence\": \"© LocationIQ.com CC BY 4.0, Data © OpenStreetMap contributors, ODbL 1.0\",\n"+
            "        \"osm_type\": \"way\",\n"+
            "        \"osm_id\": \"34633854\",\n"+
            "        \"boundingbox\": [\n"+
            "            \"40.7479226\",\n"+
            "            \"40.7489422\",\n"+
            "            \"-73.9864855\",\n"+
            "            \"-73.9848259\"\n"+
            "        ],\n"+
            "        \"lat\": \"40.7484284\",\n"+
            "        \"lon\": \"-73.9856546198733\",\n"+
            "        \"display_name\": \"Empire State Building, 350, 5th Avenue, Korea Town, Manhattan Community Board 5, New York County, NYC, New York, 10018, United States of America\",\n"+
            "        \"class\": \"tourism\",\n"+
            "        \"type\": \"attraction\",\n"+
            "        \"importance\": 0.82289665394454,\n"+
            "        \"icon\": \"https://locationiq.com/static/images/mapicons/poi_point_of_interest.p.20.png\"\n"+
            "    },\n"+
            "    {\n"+
            "        \"place_id\": \"29167569\",\n"+
            "        \"licence\": \"© LocationIQ.com CC BY 4.0, Data © OpenStreetMap contributors, ODbL 1.0\",\n"+
            "        \"osm_type\": \"node\",\n"+
            "        \"osm_id\": \"2709306673\",\n"+
            "        \"boundingbox\": [\n"+
            "            \"40.7481128\",\n"+
            "            \"40.7482128\",\n"+
            "            \"-73.9850458\",\n"+
            "            \"-73.9849458\"\n"+
            "        ],\n"+
            "        \"lat\": \"40.7481628\",\n"+
            "        \"lon\": \"-73.9849958\",\n"+
            "        \"display_name\": \"Empire State Building, 350, 5th Avenue, Korea Town, Manhattan Community Board 5, New York County, NYC, New York, 10118, United States of America\",\n"+
            "        \"class\": \"tourism\",\n"+
            "        \"type\": \"attraction\",\n"+
            "        \"importance\": 0.301,\n"+
            "        \"icon\": \"https://locationiq.com/static/images/mapicons/poi_point_of_interest.p.20.png\"\n"+
            "    }\n"+
            "  ]").toString();
}
