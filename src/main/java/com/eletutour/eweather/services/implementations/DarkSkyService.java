package com.eletutour.eweather.services.implementations;

import com.eletutour.eweather.services.Constants;
import com.eletutour.eweather.services.interfaces.IApiService;
import com.eletutour.eweather.services.interfaces.IDarkSkyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DarkSkyService implements IDarkSkyService {
    @Autowired
    private IApiService apiService;

    @Override
    public String callApi(String latitude, String longitude) {
        return apiService.callApiWithUrl(Constants.getDarkSkyUrl(latitude, longitude));

    }
}
