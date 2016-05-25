package com.example.maya.rxandroidretrofit;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by maya on 5/24/2016.
 */
public interface Weather {
    @GET("weather?")
    Observable<GetCoord> getCurrent(@Query("q") String city,@Query("appid") String appid);

}
