package com.ravi.rectrofitexample.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {

    //for get service will work
//    public static final String BASE_URL = "http://220.225.38.123:8081/LogicShore.svc/";

    public static final String BASE_URL = " http://tecdatum.net/Rckservice/api/RCK/";

    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
