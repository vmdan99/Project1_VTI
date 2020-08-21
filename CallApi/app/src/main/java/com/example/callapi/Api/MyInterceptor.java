package com.example.callapi.Api;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class MyInterceptor implements Interceptor {
    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        Request request = chain.request()
                .newBuilder()
                .addHeader("accept","application/json")
                .addHeader("Content-Type","application/json")
                .build();
        return chain.proceed(request);

    }
}
