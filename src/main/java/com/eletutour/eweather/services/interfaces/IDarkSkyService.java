package com.eletutour.eweather.services.interfaces;

import java.util.Date;

public interface IDarkSkyService {

    String callApi(String latitude, String longitude);

    String callApi(String latitude, String longitude, Date date);
}
