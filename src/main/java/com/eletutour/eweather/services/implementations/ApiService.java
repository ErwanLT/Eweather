package com.eletutour.eweather.services.implementations;

import com.eletutour.eweather.exceptions.CallApiException;
import com.eletutour.eweather.services.interfaces.IApiService;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ApiService implements IApiService {
    @Override
    public String callApiWithUrl(String url) {
        OkHttpClient client = new OkHttpClient();
        try {
            Request request = new Request.Builder()
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();

            return response.body().string();
        } catch (Exception e) {
            log.debug("error : ", e);
            throw new CallApiException(e.getMessage());
        }
    }
}
