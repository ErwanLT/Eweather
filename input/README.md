[![Build Status](https://travis-ci.org/ErwanLT/Eweather.svg?branch=master)](https://travis-ci.org/ErwanLT/Eweather)
[![codecov](https://codecov.io/gh/ErwanLT/Eweather/branch/master/graph/badge.svg)](https://codecov.io/gh/ErwanLT/Eweather)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/d48ac109265f451681eb87863d75f0e3)](https://www.codacy.com/app/ErwanLT/Eweather?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=ErwanLT/Eweather&amp;utm_campaign=Badge_Grade)
[![GitHub version](https://badge.fury.io/gh/ErwanLT%2FEweather.svg)](https://badge.fury.io/gh/ErwanLT%2FEweather)
[![MIT Licence](https://badges.frapsoft.com/os/mit/mit.svg?v=103)](https://opensource.org/licenses/mit-license.php)
[![star this repo](http://githubbadges.com/star.svg?user=ErwanLT&repo=Eweather&style=flat)](https://github.com/ErwanLT/Eweather)
[![fork this repo](http://githubbadges.com/fork.svg?user=ErwanLT&repo=Eweather&style=flat)](https://github.com/ErwanLT/Eweather/fork)
# @name@ - @version@
@description@ 

## Environment
### Setup
Currently using
* IntelliJ 2018.2
* java @java.version@
* Maven 3.5.4
* Lombok plugin

## Credit
### Map
the map displayed is from OpenStreetMap https://www.openstreetmap.fr/

## Weather layers
the weather layers are displayed thanks to leaflet
https://leafletjs.com/
and leaflet-openweathermap
https://github.com/buche/leaflet-openweathermap

## Eweather-API
API to call Eweather

- swagger-ui : http://localhost:8080/swagger-ui.html

### Use Case
### Get weather forecast from a location

- methode : GET
- URL : /eweather/forecast
- params : location
- example : /eweather/forecast?location=Paris

### Get weather forecast from coordinate
- methode : GET
- URL : /eweather/forecastLocation
- params : latitude + longitude
- example : /eweather/forecastLocation?latitude=xxxx&longitude=xxxx

- response :
```json
{
    "latitude": 48.8566969,
    "longitude": 2.3514616,
    "timezone": "Europe/Paris",
    "location": "Paris, Île-de-France, France métropolitaine, France",
    "currently": {
        "time": "1601631736",
        "summary": "Pluie",
        "icon": "rain",
        "precipIntensity": 1.7406,
        "precipProbability": 0.53,
        "precipType": "rain",
        "temperature": 12.87,
        "apparentTemperature": 12.87,
        "dewPoint": 10.47,
        "humidity": 0.85,
        "windSpeed": 4.0,
        "windBearing": 158,
        "windGust": 6.43,
        "pressure": 986.0,
        "cloudCover": 0.99,
        "ozone": 311.7,
        "visibility": 11.643,
        "nearestStormBearing": null,
        "nearestStormDistance": null
    },
    "hourly": {
        "summary": "Pluie jusqu’à demain matin.",
        "icon": "rain",
        "data": [
            {
                "time": "1601629200",
                "summary": "Pluie",
                "icon": "rain",
                "precipIntensity": 2.394,
                "precipProbability": 0.65,
                "precipType": "rain",
                "temperature": 12.43,
                "apparentTemperature": 12.43,
                "dewPoint": 10.56,
                "humidity": 0.88,
                "windSpeed": 4.66,
                "windBearing": 155,
                "windGust": 7.47,
                "pressure": 985.8,
                "cloudCover": 0.99,
                "ozone": 310.7,
                "visibility": 8.557,
                "precipAccumulation": null
            }
        ]
    },
    "daily": {
        "summary": "Pluie pendant toute la semaine.",
        "icon": "rain",
        "data": [
            {
                "time": "1601589600",
                "summary": "Pluie toute la journée.",
                "icon": "rain",
                "sunriseTime": "1601617980",
                "sunsetTime": "1601659680",
                "moonPhase": 0.53,
                "precipIntensity": 0.8043,
                "precipIntensityMax": 2.731,
                "precipProbability": 0.98,
                "precipIntensityMaxTime": "1601624220",
                "precipAccumulation": null,
                "precipType": "rain",
                "temperatureHigh": 15.28,
                "temperatureHighTime": "1601645160",
                "temperatureLow": 8.69,
                "temperatureLowTime": "1601704800",
                "apparentTemperatureHigh": 15.0,
                "apparentTemperatureHighTime": "1601645160",
                "apparentTemperatureLow": 7.64,
                "apparentTemperatureLowTime": "1601704800",
                "temperatureMin": 10.88,
                "temperatureMinTime": "1601604420",
                "temperatureMax": 15.28,
                "temperatureMaxTime": "1601645160",
                "apparentTemperatureMin": 11.15,
                "apparentTemperatureMinTime": "1601604420",
                "apparentTemperatureMax": 15.0,
                "apparentTemperatureMaxTime": "1601645160",
                "dewPoint": 10.16,
                "humidity": 0.85,
                "pressure": 988.8,
                "windSpeed": 4.02,
                "windGust": 15.04,
                "windGustTime": "1601609580",
                "windBearing": 146,
                "cloudCover": 0.99,
                "uvIndex": 2,
                "uvIndexTime": "1601638680",
                "visibility": 13.398,
                "ozone": 311.8
            }
        ]
    },
    "alerts": [
        {
            "title": "Moderate Rain-flood Warning",
            "time": "1601611620",
            "expire": null,
            "uri": "http://vigilance.meteofrance.com/"
        }
    ]
}
```
- possible error :
  * Location Error :
  ```json
  {
      "status": "INTERNAL_SERVER_ERROR",
      "timestamp": "05-10-2020 09:29:33",
      "message": "Une erreur concernant la location est survenue.",
      "debugMessage": "exception message"
  }
  ```
