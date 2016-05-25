package com.example.maya.rxandroidretrofit;

import com.example.maya.rxandroidretrofit.Pojo.MayaLog;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by maya on 5/25/2016.
 */
public interface MayaLogin {
    @FormUrlEncoded
    @POST("api/v2/auth/login")
    Observable<MayaLog> updateUser(@Field("credentials[email]") String email, @Field("credentials[password]") String pass,
                                   @Field("credentials[source]") String source);
}
