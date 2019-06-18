package com.eletutour.eweather.services.interfaces;

import com.eletutour.eweather.datapoint.ForecastResponse;
import com.eletutour.eweather.form.Forecast;

public interface IResponseToFormService {

    Forecast darkskyResponseToForm(ForecastResponse responseForecast);
}
