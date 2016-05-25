package com.example.maya.rxandroidretrofit;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by maya on 5/25/2016.
 */
public interface Maya {
    @GET("api/v2/all/questions/7178/0")
    Observable<Example> getAllqueue();
}
