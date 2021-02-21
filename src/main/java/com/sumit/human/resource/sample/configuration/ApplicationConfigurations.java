package com.sumit.human.resource.sample.configuration;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

//@Configuration
public class ApplicationConfigurations {

    @Bean
    public RestTemplate getApplicationRestTemplate() {
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory(okHttpClientRestTemplate()));
    }

    private OkHttpClient okHttpClientRestTemplate() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        ConnectionPool okHttpConnectionPool = new ConnectionPool(50, 30, TimeUnit.SECONDS);
        builder.connectionPool(okHttpConnectionPool);
        builder.connectTimeout(20, TimeUnit.SECONDS);
        builder.retryOnConnectionFailure(false);
        return builder.build();
    }
}
