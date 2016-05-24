package com.example.maya.rxandroidretrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by maya on 5/24/2016.
 * Retrofitbuilder
 *
 * Basically this is the retrofit builder. It generates the retrofit builder
 * Nothing to change here, but this is optimized for rxjava
 *
 * <uses-permission android:name="android.permission.INTERNET" />
 * compile 'com.squareup.retrofit2:retrofit:2.0.2'
 * compile 'io.reactivex:rxandroid:1.2.0'
 * compile 'io.reactivex:rxjava:1.1.5'
 * compile 'com.squareup.retrofit2:adapter-rxjava:2.0.2'
 * compile 'com.squareup.retrofit2:converter-gson:2.0.2'
 */
public class RetrofitBuilder {

    public static Retrofit RetrofitBuilderFunction(String baseURL)
    {

        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseURL)
                .build();
        return retrofit;
    }
}
