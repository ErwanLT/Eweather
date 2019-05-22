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

public class ForecastResponse {

    public static final String darkSkyResponse = new StringBuilder().append(
                    "{\n" +
                    "  \"latitude\": 48.8566,\n" +
                    "  \"longitude\": 2.3515,\n" +
                    "  \"timezone\": \"Europe/Paris\",\n" +
                    "  \"currently\": {\n" +
                    "    \"time\": 1552627687,\n" +
                    "    \"summary\": \"Breezy and Overcast\",\n" +
                    "    \"icon\": \"wind\",\n" +
                    "    \"precipIntensity\": 0.004,\n" +
                    "    \"precipProbability\": 0.24,\n" +
                    "    \"precipType\": \"rain\",\n" +
                    "    \"temperature\": 52.69,\n" +
                    "    \"apparentTemperature\": 52.69,\n" +
                    "    \"dewPoint\": 47.9,\n" +
                    "    \"humidity\": 0.84,\n" +
                    "    \"pressure\": 1013.27,\n" +
                    "    \"windSpeed\": 18.19,\n" +
                    "    \"windGust\": 37.58,\n" +
                    "    \"windBearing\": 250,\n" +
                    "    \"cloudCover\": 0.94,\n" +
                    "    \"uvIndex\": 0,\n" +
                    "    \"visibility\": 6.53,\n" +
                    "    \"ozone\": 330.68\n" +
                    "  },\n" +
                    "  \"hourly\": {\n" +
                    "    \"summary\": \"Breezy later this morning and overcast throughout the day.\",\n" +
                    "    \"icon\": \"wind\",\n" +
                    "    \"data\": [\n" +
                    "      {\n" +
                    "        \"time\": 1552626000,\n" +
                    "        \"summary\": \"Breezy and Overcast\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0.0048,\n" +
                    "        \"precipProbability\": 0.25,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 52.92,\n" +
                    "        \"apparentTemperature\": 52.92,\n" +
                    "        \"dewPoint\": 47.88,\n" +
                    "        \"humidity\": 0.83,\n" +
                    "        \"pressure\": 1013.17,\n" +
                    "        \"windSpeed\": 18.01,\n" +
                    "        \"windGust\": 37.69,\n" +
                    "        \"windBearing\": 244,\n" +
                    "        \"cloudCover\": 0.94,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 6.11,\n" +
                    "        \"ozone\": 331.64\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552629600,\n" +
                    "        \"summary\": \"Breezy and Overcast\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0.0031,\n" +
                    "        \"precipProbability\": 0.23,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 52.44,\n" +
                    "        \"apparentTemperature\": 52.44,\n" +
                    "        \"dewPoint\": 47.91,\n" +
                    "        \"humidity\": 0.85,\n" +
                    "        \"pressure\": 1013.39,\n" +
                    "        \"windSpeed\": 18.57,\n" +
                    "        \"windGust\": 37.46,\n" +
                    "        \"windBearing\": 255,\n" +
                    "        \"cloudCover\": 0.95,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 7,\n" +
                    "        \"ozone\": 329.59\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552633200,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0021,\n" +
                    "        \"precipProbability\": 0.16,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 52.98,\n" +
                    "        \"apparentTemperature\": 52.98,\n" +
                    "        \"dewPoint\": 47.84,\n" +
                    "        \"humidity\": 0.83,\n" +
                    "        \"pressure\": 1013.77,\n" +
                    "        \"windSpeed\": 10.33,\n" +
                    "        \"windGust\": 36.83,\n" +
                    "        \"windBearing\": 247,\n" +
                    "        \"cloudCover\": 0.98,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 328.21\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552636800,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0015,\n" +
                    "        \"precipProbability\": 0.11,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.76,\n" +
                    "        \"apparentTemperature\": 53.76,\n" +
                    "        \"dewPoint\": 47.68,\n" +
                    "        \"humidity\": 0.8,\n" +
                    "        \"pressure\": 1014.26,\n" +
                    "        \"windSpeed\": 4.69,\n" +
                    "        \"windGust\": 35.78,\n" +
                    "        \"windBearing\": 281,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 327.03\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552640400,\n" +
                    "        \"summary\": \"Breezy and Overcast\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0.0014,\n" +
                    "        \"precipProbability\": 0.11,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.69,\n" +
                    "        \"apparentTemperature\": 53.69,\n" +
                    "        \"dewPoint\": 47.95,\n" +
                    "        \"humidity\": 0.81,\n" +
                    "        \"pressure\": 1014.67,\n" +
                    "        \"windSpeed\": 19.68,\n" +
                    "        \"windGust\": 34.6,\n" +
                    "        \"windBearing\": 269,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 326.08\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552644000,\n" +
                    "        \"summary\": \"Breezy and Overcast\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0.0015,\n" +
                    "        \"precipProbability\": 0.1,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.22,\n" +
                    "        \"apparentTemperature\": 54.22,\n" +
                    "        \"dewPoint\": 47.83,\n" +
                    "        \"humidity\": 0.79,\n" +
                    "        \"pressure\": 1014.97,\n" +
                    "        \"windSpeed\": 18.74,\n" +
                    "        \"windGust\": 33.17,\n" +
                    "        \"windBearing\": 268,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 325.42\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552647600,\n" +
                    "        \"summary\": \"Breezy and Overcast\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0.0019,\n" +
                    "        \"precipProbability\": 0.11,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.75,\n" +
                    "        \"apparentTemperature\": 54.75,\n" +
                    "        \"dewPoint\": 48.18,\n" +
                    "        \"humidity\": 0.78,\n" +
                    "        \"pressure\": 1015.2,\n" +
                    "        \"windSpeed\": 18.13,\n" +
                    "        \"windGust\": 31.61,\n" +
                    "        \"windBearing\": 271,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 325.06\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552651200,\n" +
                    "        \"summary\": \"Breezy and Overcast\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0.0023,\n" +
                    "        \"precipProbability\": 0.13,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 55.08,\n" +
                    "        \"apparentTemperature\": 55.08,\n" +
                    "        \"dewPoint\": 48.95,\n" +
                    "        \"humidity\": 0.8,\n" +
                    "        \"pressure\": 1015.41,\n" +
                    "        \"windSpeed\": 18.81,\n" +
                    "        \"windGust\": 30.52,\n" +
                    "        \"windBearing\": 270,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 324.89\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552654800,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0023,\n" +
                    "        \"precipProbability\": 0.12,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 55.42,\n" +
                    "        \"apparentTemperature\": 55.42,\n" +
                    "        \"dewPoint\": 49.03,\n" +
                    "        \"humidity\": 0.79,\n" +
                    "        \"pressure\": 1015.56,\n" +
                    "        \"windSpeed\": 12.22,\n" +
                    "        \"windGust\": 30.36,\n" +
                    "        \"windBearing\": 331,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 324.95\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552658400,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0022,\n" +
                    "        \"precipProbability\": 0.1,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 55.66,\n" +
                    "        \"apparentTemperature\": 55.66,\n" +
                    "        \"dewPoint\": 48.98,\n" +
                    "        \"humidity\": 0.78,\n" +
                    "        \"pressure\": 1015.68,\n" +
                    "        \"windSpeed\": 11.01,\n" +
                    "        \"windGust\": 30.69,\n" +
                    "        \"windBearing\": 194,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 325.08\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552662000,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.002,\n" +
                    "        \"precipProbability\": 0.09,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 55.93,\n" +
                    "        \"apparentTemperature\": 55.93,\n" +
                    "        \"dewPoint\": 48.82,\n" +
                    "        \"humidity\": 0.77,\n" +
                    "        \"pressure\": 1015.79,\n" +
                    "        \"windSpeed\": 17.66,\n" +
                    "        \"windGust\": 30.74,\n" +
                    "        \"windBearing\": 268,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 325.24\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552665600,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0016,\n" +
                    "        \"precipProbability\": 0.07,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 56.06,\n" +
                    "        \"apparentTemperature\": 56.06,\n" +
                    "        \"dewPoint\": 48.39,\n" +
                    "        \"humidity\": 0.75,\n" +
                    "        \"pressure\": 1015.9,\n" +
                    "        \"windSpeed\": 17.26,\n" +
                    "        \"windGust\": 30.06,\n" +
                    "        \"windBearing\": 268,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 325.4\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552669200,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0014,\n" +
                    "        \"precipProbability\": 0.05,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 56.07,\n" +
                    "        \"apparentTemperature\": 56.07,\n" +
                    "        \"dewPoint\": 47.84,\n" +
                    "        \"humidity\": 0.74,\n" +
                    "        \"pressure\": 1015.99,\n" +
                    "        \"windSpeed\": 16.87,\n" +
                    "        \"windGust\": 29.09,\n" +
                    "        \"windBearing\": 268,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 325.53\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552672800,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0014,\n" +
                    "        \"precipProbability\": 0.05,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 55.88,\n" +
                    "        \"apparentTemperature\": 55.88,\n" +
                    "        \"dewPoint\": 47.7,\n" +
                    "        \"humidity\": 0.74,\n" +
                    "        \"pressure\": 1016.18,\n" +
                    "        \"windSpeed\": 17.13,\n" +
                    "        \"windGust\": 28.45,\n" +
                    "        \"windBearing\": 265,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 325.45\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552676400,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0015,\n" +
                    "        \"precipProbability\": 0.05,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 55.55,\n" +
                    "        \"apparentTemperature\": 55.55,\n" +
                    "        \"dewPoint\": 47.63,\n" +
                    "        \"humidity\": 0.75,\n" +
                    "        \"pressure\": 1016.55,\n" +
                    "        \"windSpeed\": 16.54,\n" +
                    "        \"windGust\": 28.53,\n" +
                    "        \"windBearing\": 264,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 324.91\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552680000,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0017,\n" +
                    "        \"precipProbability\": 0.06,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 55.05,\n" +
                    "        \"apparentTemperature\": 55.05,\n" +
                    "        \"dewPoint\": 47.7,\n" +
                    "        \"humidity\": 0.76,\n" +
                    "        \"pressure\": 1017.02,\n" +
                    "        \"windSpeed\": 15.88,\n" +
                    "        \"windGust\": 28.94,\n" +
                    "        \"windBearing\": 263,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 324.16\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552683600,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0019,\n" +
                    "        \"precipProbability\": 0.06,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.5,\n" +
                    "        \"apparentTemperature\": 54.5,\n" +
                    "        \"dewPoint\": 47.67,\n" +
                    "        \"humidity\": 0.78,\n" +
                    "        \"pressure\": 1017.38,\n" +
                    "        \"windSpeed\": 15.36,\n" +
                    "        \"windGust\": 29.16,\n" +
                    "        \"windBearing\": 261,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 323.68\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552687200,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0022,\n" +
                    "        \"precipProbability\": 0.07,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 54.07,\n" +
                    "        \"apparentTemperature\": 54.07,\n" +
                    "        \"dewPoint\": 47.4,\n" +
                    "        \"humidity\": 0.78,\n" +
                    "        \"pressure\": 1017.57,\n" +
                    "        \"windSpeed\": 15.02,\n" +
                    "        \"windGust\": 28.91,\n" +
                    "        \"windBearing\": 259,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 323.67\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552690800,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0028,\n" +
                    "        \"precipProbability\": 0.08,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.71,\n" +
                    "        \"apparentTemperature\": 53.71,\n" +
                    "        \"dewPoint\": 47.03,\n" +
                    "        \"humidity\": 0.78,\n" +
                    "        \"pressure\": 1017.66,\n" +
                    "        \"windSpeed\": 14.79,\n" +
                    "        \"windGust\": 28.47,\n" +
                    "        \"windBearing\": 256,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 323.85\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552694400,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0032,\n" +
                    "        \"precipProbability\": 0.08,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.33,\n" +
                    "        \"apparentTemperature\": 53.33,\n" +
                    "        \"dewPoint\": 46.52,\n" +
                    "        \"humidity\": 0.78,\n" +
                    "        \"pressure\": 1017.61,\n" +
                    "        \"windSpeed\": 14.66,\n" +
                    "        \"windGust\": 28.16,\n" +
                    "        \"windBearing\": 254,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 324.23\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552698000,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0025,\n" +
                    "        \"precipProbability\": 0.06,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 52.95,\n" +
                    "        \"apparentTemperature\": 52.95,\n" +
                    "        \"dewPoint\": 45.84,\n" +
                    "        \"humidity\": 0.77,\n" +
                    "        \"pressure\": 1017.32,\n" +
                    "        \"windSpeed\": 14.7,\n" +
                    "        \"windGust\": 28.27,\n" +
                    "        \"windBearing\": 251,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 324.71\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552701600,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0015,\n" +
                    "        \"precipProbability\": 0.04,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 52.58,\n" +
                    "        \"apparentTemperature\": 52.58,\n" +
                    "        \"dewPoint\": 45.05,\n" +
                    "        \"humidity\": 0.75,\n" +
                    "        \"pressure\": 1016.92,\n" +
                    "        \"windSpeed\": 14.83,\n" +
                    "        \"windGust\": 28.51,\n" +
                    "        \"windBearing\": 249,\n" +
                    "        \"cloudCover\": 0.99,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 325.34\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552705200,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0009,\n" +
                    "        \"precipProbability\": 0.03,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 52.33,\n" +
                    "        \"apparentTemperature\": 52.33,\n" +
                    "        \"dewPoint\": 44.33,\n" +
                    "        \"humidity\": 0.74,\n" +
                    "        \"pressure\": 1016.59,\n" +
                    "        \"windSpeed\": 14.83,\n" +
                    "        \"windGust\": 28.49,\n" +
                    "        \"windBearing\": 247,\n" +
                    "        \"cloudCover\": 0.98,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 325.88\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552708800,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0006,\n" +
                    "        \"precipProbability\": 0.03,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 51.59,\n" +
                    "        \"apparentTemperature\": 51.59,\n" +
                    "        \"dewPoint\": 43.71,\n" +
                    "        \"humidity\": 0.74,\n" +
                    "        \"pressure\": 1016.46,\n" +
                    "        \"windSpeed\": 14.49,\n" +
                    "        \"windGust\": 27.83,\n" +
                    "        \"windBearing\": 245,\n" +
                    "        \"cloudCover\": 0.97,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 326.18\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552712400,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0005,\n" +
                    "        \"precipProbability\": 0.03,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 50.78,\n" +
                    "        \"apparentTemperature\": 50.78,\n" +
                    "        \"dewPoint\": 43.18,\n" +
                    "        \"humidity\": 0.75,\n" +
                    "        \"pressure\": 1016.45,\n" +
                    "        \"windSpeed\": 14.02,\n" +
                    "        \"windGust\": 26.93,\n" +
                    "        \"windBearing\": 243,\n" +
                    "        \"cloudCover\": 0.97,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 326.36\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552716000,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0006,\n" +
                    "        \"precipProbability\": 0.03,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 50.3,\n" +
                    "        \"apparentTemperature\": 50.3,\n" +
                    "        \"dewPoint\": 42.83,\n" +
                    "        \"humidity\": 0.75,\n" +
                    "        \"pressure\": 1016.42,\n" +
                    "        \"windSpeed\": 13.88,\n" +
                    "        \"windGust\": 26.26,\n" +
                    "        \"windBearing\": 241,\n" +
                    "        \"cloudCover\": 0.97,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 326.69\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552719600,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0007,\n" +
                    "        \"precipProbability\": 0.04,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 50.99,\n" +
                    "        \"apparentTemperature\": 50.99,\n" +
                    "        \"dewPoint\": 43.02,\n" +
                    "        \"humidity\": 0.74,\n" +
                    "        \"pressure\": 1016.41,\n" +
                    "        \"windSpeed\": 14.13,\n" +
                    "        \"windGust\": 26.15,\n" +
                    "        \"windBearing\": 237,\n" +
                    "        \"cloudCover\": 0.97,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 327.3\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552723200,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.001,\n" +
                    "        \"precipProbability\": 0.04,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 50.95,\n" +
                    "        \"apparentTemperature\": 50.95,\n" +
                    "        \"dewPoint\": 42.84,\n" +
                    "        \"humidity\": 0.74,\n" +
                    "        \"pressure\": 1016.4,\n" +
                    "        \"windSpeed\": 14.33,\n" +
                    "        \"windGust\": 26.31,\n" +
                    "        \"windBearing\": 236,\n" +
                    "        \"cloudCover\": 0.99,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 328.09\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552726800,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0012,\n" +
                    "        \"precipProbability\": 0.04,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 50.75,\n" +
                    "        \"apparentTemperature\": 50.75,\n" +
                    "        \"dewPoint\": 42.62,\n" +
                    "        \"humidity\": 0.74,\n" +
                    "        \"pressure\": 1016.24,\n" +
                    "        \"windSpeed\": 14.65,\n" +
                    "        \"windGust\": 26.43,\n" +
                    "        \"windBearing\": 234,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 328.46\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552730400,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.001,\n" +
                    "        \"precipProbability\": 0.04,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 50.9,\n" +
                    "        \"apparentTemperature\": 50.9,\n" +
                    "        \"dewPoint\": 42.33,\n" +
                    "        \"humidity\": 0.72,\n" +
                    "        \"pressure\": 1015.89,\n" +
                    "        \"windSpeed\": 15.25,\n" +
                    "        \"windGust\": 26.4,\n" +
                    "        \"windBearing\": 232,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 328.01\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552734000,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0008,\n" +
                    "        \"precipProbability\": 0.07,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 51.87,\n" +
                    "        \"apparentTemperature\": 51.87,\n" +
                    "        \"dewPoint\": 42.21,\n" +
                    "        \"humidity\": 0.7,\n" +
                    "        \"pressure\": 1015.4,\n" +
                    "        \"windSpeed\": 16.07,\n" +
                    "        \"windGust\": 26.31,\n" +
                    "        \"windBearing\": 231,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 327.2\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552737600,\n" +
                    "        \"summary\": \"Overcast\",\n" +
                    "        \"icon\": \"cloudy\",\n" +
                    "        \"precipIntensity\": 0.0006,\n" +
                    "        \"precipProbability\": 0.06,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 53.07,\n" +
                    "        \"apparentTemperature\": 53.07,\n" +
                    "        \"dewPoint\": 42.27,\n" +
                    "        \"humidity\": 0.67,\n" +
                    "        \"pressure\": 1014.74,\n" +
                    "        \"windSpeed\": 16.74,\n" +
                    "        \"windGust\": 26.28,\n" +
                    "        \"windBearing\": 230,\n" +
                    "        \"cloudCover\": 1,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 326.93\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552741200,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0.0003,\n" +
                    "        \"precipProbability\": 0.05,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 55.04,\n" +
                    "        \"apparentTemperature\": 55.04,\n" +
                    "        \"dewPoint\": 42.48,\n" +
                    "        \"humidity\": 0.63,\n" +
                    "        \"pressure\": 1013.82,\n" +
                    "        \"windSpeed\": 17.14,\n" +
                    "        \"windGust\": 26.17,\n" +
                    "        \"windBearing\": 230,\n" +
                    "        \"cloudCover\": 0.93,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 327.92\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552744800,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 57.01,\n" +
                    "        \"apparentTemperature\": 57.01,\n" +
                    "        \"dewPoint\": 42.74,\n" +
                    "        \"humidity\": 0.59,\n" +
                    "        \"pressure\": 1012.73,\n" +
                    "        \"windSpeed\": 17.34,\n" +
                    "        \"windGust\": 26.13,\n" +
                    "        \"windBearing\": 230,\n" +
                    "        \"cloudCover\": 0.83,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 329.4\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552748400,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 58.38,\n" +
                    "        \"apparentTemperature\": 58.38,\n" +
                    "        \"dewPoint\": 42.88,\n" +
                    "        \"humidity\": 0.56,\n" +
                    "        \"pressure\": 1011.68,\n" +
                    "        \"windSpeed\": 17.22,\n" +
                    "        \"windGust\": 26.46,\n" +
                    "        \"windBearing\": 230,\n" +
                    "        \"cloudCover\": 0.74,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 330.26\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552752000,\n" +
                    "        \"summary\": \"Mostly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 58.52,\n" +
                    "        \"apparentTemperature\": 58.52,\n" +
                    "        \"dewPoint\": 42.82,\n" +
                    "        \"humidity\": 0.56,\n" +
                    "        \"pressure\": 1010.72,\n" +
                    "        \"windSpeed\": 16.52,\n" +
                    "        \"windGust\": 27.33,\n" +
                    "        \"windBearing\": 226,\n" +
                    "        \"cloudCover\": 0.65,\n" +
                    "        \"uvIndex\": 1,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 329.81\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552755600,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 57.75,\n" +
                    "        \"apparentTemperature\": 57.75,\n" +
                    "        \"dewPoint\": 42.71,\n" +
                    "        \"humidity\": 0.57,\n" +
                    "        \"pressure\": 1009.8,\n" +
                    "        \"windSpeed\": 15.47,\n" +
                    "        \"windGust\": 28.56,\n" +
                    "        \"windBearing\": 221,\n" +
                    "        \"cloudCover\": 0.56,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 328.8\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552759200,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 56.33,\n" +
                    "        \"apparentTemperature\": 56.33,\n" +
                    "        \"dewPoint\": 42.48,\n" +
                    "        \"humidity\": 0.6,\n" +
                    "        \"pressure\": 1009.03,\n" +
                    "        \"windSpeed\": 14.85,\n" +
                    "        \"windGust\": 30.03,\n" +
                    "        \"windBearing\": 218,\n" +
                    "        \"cloudCover\": 0.46,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 327.84\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552762800,\n" +
                    "        \"summary\": \"Partly Cloudy\",\n" +
                    "        \"icon\": \"partly-cloudy-night\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 55.44,\n" +
                    "        \"apparentTemperature\": 55.44,\n" +
                    "        \"dewPoint\": 42.12,\n" +
                    "        \"humidity\": 0.61,\n" +
                    "        \"pressure\": 1008.49,\n" +
                    "        \"windSpeed\": 15.08,\n" +
                    "        \"windGust\": 31.79,\n" +
                    "        \"windBearing\": 217,\n" +
                    "        \"cloudCover\": 0.34,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 326.82\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552766400,\n" +
                    "        \"summary\": \"Clear\",\n" +
                    "        \"icon\": \"clear-night\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 54.54,\n" +
                    "        \"apparentTemperature\": 54.54,\n" +
                    "        \"dewPoint\": 41.6,\n" +
                    "        \"humidity\": 0.62,\n" +
                    "        \"pressure\": 1008.1,\n" +
                    "        \"windSpeed\": 15.76,\n" +
                    "        \"windGust\": 33.75,\n" +
                    "        \"windBearing\": 218,\n" +
                    "        \"cloudCover\": 0.21,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 325.83\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552770000,\n" +
                    "        \"summary\": \"Clear\",\n" +
                    "        \"icon\": \"clear-night\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 54.01,\n" +
                    "        \"apparentTemperature\": 54.01,\n" +
                    "        \"dewPoint\": 40.8,\n" +
                    "        \"humidity\": 0.61,\n" +
                    "        \"pressure\": 1007.62,\n" +
                    "        \"windSpeed\": 16.41,\n" +
                    "        \"windGust\": 35.51,\n" +
                    "        \"windBearing\": 219,\n" +
                    "        \"cloudCover\": 0.11,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 325.73\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552773600,\n" +
                    "        \"summary\": \"Breezy\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 53.5,\n" +
                    "        \"apparentTemperature\": 53.5,\n" +
                    "        \"dewPoint\": 39.29,\n" +
                    "        \"humidity\": 0.58,\n" +
                    "        \"pressure\": 1006.98,\n" +
                    "        \"windSpeed\": 16.99,\n" +
                    "        \"windGust\": 37.13,\n" +
                    "        \"windBearing\": 220,\n" +
                    "        \"cloudCover\": 0.08,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 326.79\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552777200,\n" +
                    "        \"summary\": \"Breezy\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 52.85,\n" +
                    "        \"apparentTemperature\": 52.85,\n" +
                    "        \"dewPoint\": 37.5,\n" +
                    "        \"humidity\": 0.56,\n" +
                    "        \"pressure\": 1006.27,\n" +
                    "        \"windSpeed\": 17.55,\n" +
                    "        \"windGust\": 38.54,\n" +
                    "        \"windBearing\": 220,\n" +
                    "        \"cloudCover\": 0.07,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 328.71\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552780800,\n" +
                    "        \"summary\": \"Windy\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 52.16,\n" +
                    "        \"apparentTemperature\": 52.16,\n" +
                    "        \"dewPoint\": 36.56,\n" +
                    "        \"humidity\": 0.55,\n" +
                    "        \"pressure\": 1005.55,\n" +
                    "        \"windSpeed\": 17.86,\n" +
                    "        \"windGust\": 39.14,\n" +
                    "        \"windBearing\": 222,\n" +
                    "        \"cloudCover\": 0.06,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 331.74\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552784400,\n" +
                    "        \"summary\": \"Breezy\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 51.52,\n" +
                    "        \"apparentTemperature\": 51.52,\n" +
                    "        \"dewPoint\": 37.18,\n" +
                    "        \"humidity\": 0.58,\n" +
                    "        \"pressure\": 1004.73,\n" +
                    "        \"windSpeed\": 17.73,\n" +
                    "        \"windGust\": 38.31,\n" +
                    "        \"windBearing\": 224,\n" +
                    "        \"cloudCover\": 0.06,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 336.46\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552788000,\n" +
                    "        \"summary\": \"Breezy\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 50.71,\n" +
                    "        \"apparentTemperature\": 50.71,\n" +
                    "        \"dewPoint\": 38.62,\n" +
                    "        \"humidity\": 0.63,\n" +
                    "        \"pressure\": 1003.92,\n" +
                    "        \"windSpeed\": 17.34,\n" +
                    "        \"windGust\": 36.66,\n" +
                    "        \"windBearing\": 229,\n" +
                    "        \"cloudCover\": 0.07,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 342.29\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552791600,\n" +
                    "        \"summary\": \"Breezy\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperature\": 50.12,\n" +
                    "        \"apparentTemperature\": 50.12,\n" +
                    "        \"dewPoint\": 40.06,\n" +
                    "        \"humidity\": 0.68,\n" +
                    "        \"pressure\": 1003.33,\n" +
                    "        \"windSpeed\": 17.07,\n" +
                    "        \"windGust\": 35.39,\n" +
                    "        \"windBearing\": 232,\n" +
                    "        \"cloudCover\": 0.13,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 347.93\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552795200,\n" +
                    "        \"summary\": \"Breezy\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0.0031,\n" +
                    "        \"precipProbability\": 0.17,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 50.23,\n" +
                    "        \"apparentTemperature\": 50.23,\n" +
                    "        \"dewPoint\": 41.56,\n" +
                    "        \"humidity\": 0.72,\n" +
                    "        \"pressure\": 1003.02,\n" +
                    "        \"windSpeed\": 17.27,\n" +
                    "        \"windGust\": 35.45,\n" +
                    "        \"windBearing\": 236,\n" +
                    "        \"cloudCover\": 0.23,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 352.82\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552798800,\n" +
                    "        \"summary\": \"Breezy and Partly Cloudy\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"precipIntensity\": 0.0175,\n" +
                    "        \"precipProbability\": 0.45,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperature\": 50.83,\n" +
                    "        \"apparentTemperature\": 50.83,\n" +
                    "        \"dewPoint\": 43.14,\n" +
                    "        \"humidity\": 0.75,\n" +
                    "        \"pressure\": 1002.94,\n" +
                    "        \"windSpeed\": 17.5,\n" +
                    "        \"windGust\": 35.88,\n" +
                    "        \"windBearing\": 240,\n" +
                    "        \"cloudCover\": 0.37,\n" +
                    "        \"uvIndex\": 0,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 357.45\n" +
                    "      }\n" +
                    "    ]\n" +
                    "  },\n" +
                    "  \"daily\": {\n" +
                    "    \"summary\": \"Light rain today and Sunday, with high temperatures bottoming out at 53°F on Sunday.\",\n" +
                    "    \"icon\": \"rain\",\n" +
                    "    \"data\": [\n" +
                    "      {\n" +
                    "        \"time\": 1552604400,\n" +
                    "        \"summary\": \"Overcast throughout the day and breezy until afternoon.\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"sunriseTime\": 1552629942,\n" +
                    "        \"sunsetTime\": 1552672565,\n" +
                    "        \"moonPhase\": 0.29,\n" +
                    "        \"precipIntensity\": 0.005,\n" +
                    "        \"precipIntensityMax\": 0.0198,\n" +
                    "        \"precipIntensityMaxTime\": 1552608000,\n" +
                    "        \"precipProbability\": 0.83,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperatureHigh\": 56.07,\n" +
                    "        \"temperatureHighTime\": 1552669200,\n" +
                    "        \"temperatureLow\": 50.3,\n" +
                    "        \"temperatureLowTime\": 1552716000,\n" +
                    "        \"apparentTemperatureHigh\": 56.07,\n" +
                    "        \"apparentTemperatureHighTime\": 1552669200,\n" +
                    "        \"apparentTemperatureLow\": 50.3,\n" +
                    "        \"apparentTemperatureLowTime\": 1552716000,\n" +
                    "        \"dewPoint\": 48.29,\n" +
                    "        \"humidity\": 0.81,\n" +
                    "        \"pressure\": 1014.96,\n" +
                    "        \"windSpeed\": 14.35,\n" +
                    "        \"windGust\": 37.69,\n" +
                    "        \"windGustTime\": 1552626000,\n" +
                    "        \"windBearing\": 263,\n" +
                    "        \"cloudCover\": 0.97,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"uvIndexTime\": 1552651200,\n" +
                    "        \"visibility\": 8.56,\n" +
                    "        \"ozone\": 328.11,\n" +
                    "        \"temperatureMin\": 51.36,\n" +
                    "        \"temperatureMinTime\": 1552608000,\n" +
                    "        \"temperatureMax\": 56.07,\n" +
                    "        \"temperatureMaxTime\": 1552669200,\n" +
                    "        \"apparentTemperatureMin\": 51.36,\n" +
                    "        \"apparentTemperatureMinTime\": 1552608000,\n" +
                    "        \"apparentTemperatureMax\": 56.07,\n" +
                    "        \"apparentTemperatureMaxTime\": 1552669200\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552690800,\n" +
                    "        \"summary\": \"Mostly cloudy until evening and breezy overnight.\",\n" +
                    "        \"icon\": \"wind\",\n" +
                    "        \"sunriseTime\": 1552716216,\n" +
                    "        \"sunsetTime\": 1552759056,\n" +
                    "        \"moonPhase\": 0.33,\n" +
                    "        \"precipIntensity\": 0.0008,\n" +
                    "        \"precipIntensityMax\": 0.0032,\n" +
                    "        \"precipIntensityMaxTime\": 1552694400,\n" +
                    "        \"precipProbability\": 0.28,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperatureHigh\": 58.52,\n" +
                    "        \"temperatureHighTime\": 1552752000,\n" +
                    "        \"temperatureLow\": 49.07,\n" +
                    "        \"temperatureLowTime\": 1552806000,\n" +
                    "        \"apparentTemperatureHigh\": 58.52,\n" +
                    "        \"apparentTemperatureHighTime\": 1552752000,\n" +
                    "        \"apparentTemperatureLow\": 44.22,\n" +
                    "        \"apparentTemperatureLowTime\": 1552806000,\n" +
                    "        \"dewPoint\": 43.07,\n" +
                    "        \"humidity\": 0.68,\n" +
                    "        \"pressure\": 1013.73,\n" +
                    "        \"windSpeed\": 15.1,\n" +
                    "        \"windGust\": 37.13,\n" +
                    "        \"windGustTime\": 1552773600,\n" +
                    "        \"windBearing\": 233,\n" +
                    "        \"cloudCover\": 0.78,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"uvIndexTime\": 1552737600,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 327.02,\n" +
                    "        \"temperatureMin\": 50.3,\n" +
                    "        \"temperatureMinTime\": 1552716000,\n" +
                    "        \"temperatureMax\": 58.52,\n" +
                    "        \"temperatureMaxTime\": 1552752000,\n" +
                    "        \"apparentTemperatureMin\": 50.3,\n" +
                    "        \"apparentTemperatureMinTime\": 1552716000,\n" +
                    "        \"apparentTemperatureMax\": 58.52,\n" +
                    "        \"apparentTemperatureMaxTime\": 1552752000\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552777200,\n" +
                    "        \"summary\": \"Light rain and breezy in the morning.\",\n" +
                    "        \"icon\": \"rain\",\n" +
                    "        \"sunriseTime\": 1552802489,\n" +
                    "        \"sunsetTime\": 1552845546,\n" +
                    "        \"moonPhase\": 0.37,\n" +
                    "        \"precipIntensity\": 0.0091,\n" +
                    "        \"precipIntensityMax\": 0.0401,\n" +
                    "        \"precipIntensityMaxTime\": 1552813200,\n" +
                    "        \"precipProbability\": 0.85,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperatureHigh\": 51.5,\n" +
                    "        \"temperatureHighTime\": 1552824000,\n" +
                    "        \"temperatureLow\": 41.01,\n" +
                    "        \"temperatureLowTime\": 1552885200,\n" +
                    "        \"apparentTemperatureHigh\": 51.5,\n" +
                    "        \"apparentTemperatureHighTime\": 1552824000,\n" +
                    "        \"apparentTemperatureLow\": 35.16,\n" +
                    "        \"apparentTemperatureLowTime\": 1552885200,\n" +
                    "        \"dewPoint\": 36.48,\n" +
                    "        \"humidity\": 0.63,\n" +
                    "        \"pressure\": 1007.95,\n" +
                    "        \"windSpeed\": 10.69,\n" +
                    "        \"windGust\": 39.14,\n" +
                    "        \"windGustTime\": 1552780800,\n" +
                    "        \"windBearing\": 248,\n" +
                    "        \"cloudCover\": 0.64,\n" +
                    "        \"uvIndex\": 2,\n" +
                    "        \"uvIndexTime\": 1552816800,\n" +
                    "        \"visibility\": 6.8,\n" +
                    "        \"ozone\": 369.94,\n" +
                    "        \"temperatureMin\": 44.03,\n" +
                    "        \"temperatureMinTime\": 1552860000,\n" +
                    "        \"temperatureMax\": 52.85,\n" +
                    "        \"temperatureMaxTime\": 1552777200,\n" +
                    "        \"apparentTemperatureMin\": 38.66,\n" +
                    "        \"apparentTemperatureMinTime\": 1552856400,\n" +
                    "        \"apparentTemperatureMax\": 52.85,\n" +
                    "        \"apparentTemperatureMaxTime\": 1552777200\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552863600,\n" +
                    "        \"summary\": \"Clear throughout the day.\",\n" +
                    "        \"icon\": \"clear-day\",\n" +
                    "        \"sunriseTime\": 1552888763,\n" +
                    "        \"sunsetTime\": 1552932037,\n" +
                    "        \"moonPhase\": 0.41,\n" +
                    "        \"precipIntensity\": 0.0001,\n" +
                    "        \"precipIntensityMax\": 0.0006,\n" +
                    "        \"precipIntensityMaxTime\": 1552888800,\n" +
                    "        \"precipProbability\": 0.1,\n" +
                    "        \"precipType\": \"rain\",\n" +
                    "        \"temperatureHigh\": 54.16,\n" +
                    "        \"temperatureHighTime\": 1552917600,\n" +
                    "        \"temperatureLow\": 36.45,\n" +
                    "        \"temperatureLowTime\": 1552971600,\n" +
                    "        \"apparentTemperatureHigh\": 54.16,\n" +
                    "        \"apparentTemperatureHighTime\": 1552917600,\n" +
                    "        \"apparentTemperatureLow\": 34.33,\n" +
                    "        \"apparentTemperatureLowTime\": 1552971600,\n" +
                    "        \"dewPoint\": 31.66,\n" +
                    "        \"humidity\": 0.58,\n" +
                    "        \"pressure\": 1021.3,\n" +
                    "        \"windSpeed\": 7.97,\n" +
                    "        \"windGust\": 24.77,\n" +
                    "        \"windGustTime\": 1552863600,\n" +
                    "        \"windBearing\": 317,\n" +
                    "        \"cloudCover\": 0.06,\n" +
                    "        \"uvIndex\": 4,\n" +
                    "        \"uvIndexTime\": 1552910400,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 348.05,\n" +
                    "        \"temperatureMin\": 41.01,\n" +
                    "        \"temperatureMinTime\": 1552885200,\n" +
                    "        \"temperatureMax\": 54.16,\n" +
                    "        \"temperatureMaxTime\": 1552917600,\n" +
                    "        \"apparentTemperatureMin\": 35.16,\n" +
                    "        \"apparentTemperatureMinTime\": 1552885200,\n" +
                    "        \"apparentTemperatureMax\": 54.16,\n" +
                    "        \"apparentTemperatureMaxTime\": 1552917600\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1552950000,\n" +
                    "        \"summary\": \"Clear throughout the day.\",\n" +
                    "        \"icon\": \"clear-day\",\n" +
                    "        \"sunriseTime\": 1552975036,\n" +
                    "        \"sunsetTime\": 1553018527,\n" +
                    "        \"moonPhase\": 0.44,\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipIntensityMax\": 0,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperatureHigh\": 53.45,\n" +
                    "        \"temperatureHighTime\": 1553007600,\n" +
                    "        \"temperatureLow\": 35.55,\n" +
                    "        \"temperatureLowTime\": 1553058000,\n" +
                    "        \"apparentTemperatureHigh\": 53.45,\n" +
                    "        \"apparentTemperatureHighTime\": 1553007600,\n" +
                    "        \"apparentTemperatureLow\": 35.55,\n" +
                    "        \"apparentTemperatureLowTime\": 1553058000,\n" +
                    "        \"dewPoint\": 28.12,\n" +
                    "        \"humidity\": 0.54,\n" +
                    "        \"pressure\": 1031.28,\n" +
                    "        \"windSpeed\": 4.69,\n" +
                    "        \"windGust\": 10.17,\n" +
                    "        \"windGustTime\": 1553025600,\n" +
                    "        \"windBearing\": 31,\n" +
                    "        \"cloudCover\": 0,\n" +
                    "        \"uvIndex\": 4,\n" +
                    "        \"uvIndexTime\": 1552993200,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 304.08,\n" +
                    "        \"temperatureMin\": 36.45,\n" +
                    "        \"temperatureMinTime\": 1552971600,\n" +
                    "        \"temperatureMax\": 53.45,\n" +
                    "        \"temperatureMaxTime\": 1553007600,\n" +
                    "        \"apparentTemperatureMin\": 34.33,\n" +
                    "        \"apparentTemperatureMinTime\": 1552971600,\n" +
                    "        \"apparentTemperatureMax\": 53.45,\n" +
                    "        \"apparentTemperatureMaxTime\": 1553007600\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1553036400,\n" +
                    "        \"summary\": \"Clear throughout the day.\",\n" +
                    "        \"icon\": \"clear-day\",\n" +
                    "        \"sunriseTime\": 1553061309,\n" +
                    "        \"sunsetTime\": 1553105017,\n" +
                    "        \"moonPhase\": 0.48,\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipIntensityMax\": 0.0002,\n" +
                    "        \"precipIntensityMaxTime\": 1553072400,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperatureHigh\": 57.39,\n" +
                    "        \"temperatureHighTime\": 1553094000,\n" +
                    "        \"temperatureLow\": 38.91,\n" +
                    "        \"temperatureLowTime\": 1553144400,\n" +
                    "        \"apparentTemperatureHigh\": 57.39,\n" +
                    "        \"apparentTemperatureHighTime\": 1553094000,\n" +
                    "        \"apparentTemperatureLow\": 36,\n" +
                    "        \"apparentTemperatureLowTime\": 1553144400,\n" +
                    "        \"dewPoint\": 28.73,\n" +
                    "        \"humidity\": 0.52,\n" +
                    "        \"pressure\": 1036.56,\n" +
                    "        \"windSpeed\": 4.1,\n" +
                    "        \"windGust\": 11.4,\n" +
                    "        \"windGustTime\": 1553104800,\n" +
                    "        \"windBearing\": 44,\n" +
                    "        \"cloudCover\": 0,\n" +
                    "        \"uvIndex\": 4,\n" +
                    "        \"uvIndexTime\": 1553079600,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 301.54,\n" +
                    "        \"temperatureMin\": 35.55,\n" +
                    "        \"temperatureMinTime\": 1553058000,\n" +
                    "        \"temperatureMax\": 57.39,\n" +
                    "        \"temperatureMaxTime\": 1553094000,\n" +
                    "        \"apparentTemperatureMin\": 35.55,\n" +
                    "        \"apparentTemperatureMinTime\": 1553058000,\n" +
                    "        \"apparentTemperatureMax\": 57.39,\n" +
                    "        \"apparentTemperatureMaxTime\": 1553094000\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1553122800,\n" +
                    "        \"summary\": \"Clear throughout the day.\",\n" +
                    "        \"icon\": \"clear-day\",\n" +
                    "        \"sunriseTime\": 1553147581,\n" +
                    "        \"sunsetTime\": 1553191507,\n" +
                    "        \"moonPhase\": 0.52,\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipIntensityMax\": 0.0002,\n" +
                    "        \"precipIntensityMaxTime\": 1553158800,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperatureHigh\": 62.28,\n" +
                    "        \"temperatureHighTime\": 1553180400,\n" +
                    "        \"temperatureLow\": 38.93,\n" +
                    "        \"temperatureLowTime\": 1553234400,\n" +
                    "        \"apparentTemperatureHigh\": 62.28,\n" +
                    "        \"apparentTemperatureHighTime\": 1553180400,\n" +
                    "        \"apparentTemperatureLow\": 37.01,\n" +
                    "        \"apparentTemperatureLowTime\": 1553234400,\n" +
                    "        \"dewPoint\": 36.32,\n" +
                    "        \"humidity\": 0.6,\n" +
                    "        \"pressure\": 1035.36,\n" +
                    "        \"windSpeed\": 4.95,\n" +
                    "        \"windGust\": 11.21,\n" +
                    "        \"windGustTime\": 1553187600,\n" +
                    "        \"windBearing\": 35,\n" +
                    "        \"cloudCover\": 0.01,\n" +
                    "        \"uvIndex\": 4,\n" +
                    "        \"uvIndexTime\": 1553166000,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 310.49,\n" +
                    "        \"temperatureMin\": 38.91,\n" +
                    "        \"temperatureMinTime\": 1553144400,\n" +
                    "        \"temperatureMax\": 62.28,\n" +
                    "        \"temperatureMaxTime\": 1553180400,\n" +
                    "        \"apparentTemperatureMin\": 36,\n" +
                    "        \"apparentTemperatureMinTime\": 1553144400,\n" +
                    "        \"apparentTemperatureMax\": 62.28,\n" +
                    "        \"apparentTemperatureMaxTime\": 1553180400\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"time\": 1553209200,\n" +
                    "        \"summary\": \"Partly cloudy until evening.\",\n" +
                    "        \"icon\": \"partly-cloudy-day\",\n" +
                    "        \"sunriseTime\": 1553233854,\n" +
                    "        \"sunsetTime\": 1553277997,\n" +
                    "        \"moonPhase\": 0.56,\n" +
                    "        \"precipIntensity\": 0,\n" +
                    "        \"precipIntensityMax\": 0.0001,\n" +
                    "        \"precipIntensityMaxTime\": 1553266800,\n" +
                    "        \"precipProbability\": 0,\n" +
                    "        \"temperatureHigh\": 66.98,\n" +
                    "        \"temperatureHighTime\": 1553266800,\n" +
                    "        \"temperatureLow\": 44.44,\n" +
                    "        \"temperatureLowTime\": 1553317200,\n" +
                    "        \"apparentTemperatureHigh\": 66.98,\n" +
                    "        \"apparentTemperatureHighTime\": 1553266800,\n" +
                    "        \"apparentTemperatureLow\": 44.44,\n" +
                    "        \"apparentTemperatureLowTime\": 1553317200,\n" +
                    "        \"dewPoint\": 38.35,\n" +
                    "        \"humidity\": 0.61,\n" +
                    "        \"pressure\": 1028.61,\n" +
                    "        \"windSpeed\": 4.03,\n" +
                    "        \"windGust\": 9.54,\n" +
                    "        \"windGustTime\": 1553277600,\n" +
                    "        \"windBearing\": 77,\n" +
                    "        \"cloudCover\": 0.29,\n" +
                    "        \"uvIndex\": 3,\n" +
                    "        \"uvIndexTime\": 1553248800,\n" +
                    "        \"visibility\": 10,\n" +
                    "        \"ozone\": 325.43,\n" +
                    "        \"temperatureMin\": 38.93,\n" +
                    "        \"temperatureMinTime\": 1553234400,\n" +
                    "        \"temperatureMax\": 66.98,\n" +
                    "        \"temperatureMaxTime\": 1553266800,\n" +
                    "        \"apparentTemperatureMin\": 37.01,\n" +
                    "        \"apparentTemperatureMinTime\": 1553234400,\n" +
                    "        \"apparentTemperatureMax\": 66.98,\n" +
                    "        \"apparentTemperatureMaxTime\": 1553266800\n" +
                    "      }\n" +
                    "    ]\n" +
                    "  },\n" +
                    "  \"alerts\": [\n" +
                    "    {\n" +
                    "      \"title\": \"Moderate Wind Warning\",\n" +
                    "      \"regions\": [\n" +
                    "        \"Aisne\",\n" +
                    "        \"Allier\",\n" +
                    "        \"Alpes Maritimes\",\n" +
                    "        \"Alpes de Haute Provence\",\n" +
                    "        \"Ardennes\",\n" +
                    "        \"Aube\",\n" +
                    "        \"Aude\",\n" +
                    "        \"Aveyron\",\n" +
                    "        \"Bas Rhin\",\n" +
                    "        \"Calvados\",\n" +
                    "        \"Cher\",\n" +
                    "        \"Corse du Sud\",\n" +
                    "        \"Côte d'Or\",\n" +
                    "        \"Côtes d'Armor\",\n" +
                    "        \"Doubs\",\n" +
                    "        \"Essonne\",\n" +
                    "        \"Eure\",\n" +
                    "        \"Eure et Loir\",\n" +
                    "        \"Finistère\",\n" +
                    "        \"Haut Rhin\",\n" +
                    "        \"Haute Corse\",\n" +
                    "        \"Haute Marne\",\n" +
                    "        \"Haute Saône\",\n" +
                    "        \"Hérault\",\n" +
                    "        \"Indre\",\n" +
                    "        \"Indre et Loire\",\n" +
                    "        \"Jura\",\n" +
                    "        \"Loir et Cher\",\n" +
                    "        \"Loire Atlantique\",\n" +
                    "        \"Loiret\",\n" +
                    "        \"Lozère\",\n" +
                    "        \"Maine et Loire\",\n" +
                    "        \"Manche\",\n" +
                    "        \"Marne\",\n" +
                    "        \"Meurthe et Moselle\",\n" +
                    "        \"Meuse\",\n" +
                    "        \"Morbihan\",\n" +
                    "        \"Moselle\",\n" +
                    "        \"Nièvre\",\n" +
                    "        \"Nord\",\n" +
                    "        \"Oise\",\n" +
                    "        \"Orne\",\n" +
                    "        \"Paris et Petite Ceinture\",\n" +
                    "        \"Pas de Calais\",\n" +
                    "        \"Puy de Dôme\",\n" +
                    "        \"Pyrénées Orientales\",\n" +
                    "        \"Saône et Loire\",\n" +
                    "        \"Seine Maritime\",\n" +
                    "        \"Seine et Marne\",\n" +
                    "        \"Somme\",\n" +
                    "        \"Tarn\",\n" +
                    "        \"Territoire de Belfort\",\n" +
                    "        \"Val d'Oise\",\n" +
                    "        \"Var\",\n" +
                    "        \"Vendée\",\n" +
                    "        \"Vosges\",\n" +
                    "        \"Yonne\",\n" +
                    "        \"Yvelines\"\n" +
                    "      ],\n" +
                    "      \"severity\": \"watch\",\n" +
                    "      \"time\": 1552575600,\n" +
                    "      \"expires\": 1552662000,\n" +
                    "      \"description\": \"Although rather usual in this region, locally or potentially dangerous phenomena are expected. (such as local winds, summer thunderstorms, rising streams or high waves)\\n\",\n" +
                    "      \"uri\": \"http://vigilance.meteofrance.com/\"\n" +
                    "    }\n" +
                    "  ],\n" +
                    "  \"flags\": {\n" +
                    "    \"sources\": [\n" +
                    "      \"meteoalarm\",\n" +
                    "      \"cmc\",\n" +
                    "      \"gfs\",\n" +
                    "      \"icon\",\n" +
                    "      \"isd\",\n" +
                    "      \"madis\"\n" +
                    "    ],\n" +
                    "    \"meteoalarm-license\": \"Based on data from EUMETNET - MeteoAlarm [https://www.meteoalarm.eu/]. Time delays between this website and the MeteoAlarm website are possible; for the most up to date information about alert levels as published by the participating National Meteorological Services please use the MeteoAlarm website.\",\n" +
                    "    \"nearest-station\": 2.863,\n" +
                    "    \"units\": \"us\"\n" +
                    "  },\n" +
                    "  \"offset\": 1\n" +
                    "}"
    ).toString();
}
