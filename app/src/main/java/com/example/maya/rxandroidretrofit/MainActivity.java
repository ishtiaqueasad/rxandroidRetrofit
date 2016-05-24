package com.example.maya.rxandroidretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    String baseurl ="http://api.openweathermap.org/data/2.5/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Weather weatherService = RetrofitBuilder.RetrofitBuilderFunction(baseurl).create(Weather.class);

        Observable<GetCoord> london = weatherService.getCurrent("london","d060515dfa0b1bf4dbdba07b64436bd7");
        london.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<GetCoord>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Log.e("er",e.toString());
            }

            @Override
            public void onNext(GetCoord coord) {
                Log.e("lat",coord.coord.lat);
                Log.e("long",coord.coord.lon);
                

            }
        });
    }

}
