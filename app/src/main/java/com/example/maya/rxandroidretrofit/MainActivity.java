package com.example.maya.rxandroidretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.maya.rxandroidretrofit.Pojo.MayaLog;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    String baseurl ="http://api.openweathermap.org/data/2.5/";
    String mayaurl="http://maya.com.bd/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getLoginstuff();




    }
    public void getLoginstuff()
    {
        //STEP 1: call retrofitbuilder with proper baseurl and class

        MayaLogin weatherService = RetrofitBuilder.RetrofitBuilderFunction(mayaurl).create(MayaLogin.class);

        //STEP 2: assign the observable with proper interface
        Observable<MayaLog> london = weatherService.updateUser("ishtiaque2asad2@yahoo.com","abcd1234","app");
        london.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<MayaLog>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Log.e("mayalog2",e.toString());
            }

            @Override
            public void onNext(MayaLog mayaLog) {
                    Log.e("mayalog3",mayaLog.status.toString());
                Log.e("mayalog3",mayaLog.data.id.toString());
                Log.e("mayalog3",mayaLog.data.email);
            }
        });

    }
    public void getWeather()
    {
        //STEP 1: call retrofitbuilder with proper baseurl and class
        Weather weatherService = RetrofitBuilder.RetrofitBuilderFunction(baseurl).create(Weather.class);
        //STEP 2: assign the observable with proper interface
        Observable<GetCoord> london = weatherService.getCurrent("london","d060515dfa0b1bf4dbdba07b64436bd7");
        //STEP 3: just maintain this
        london.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<GetCoord>() {
            @Override
            public void onCompleted()
            {

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
    public void getMayaAllQueue()
    {
        //STEP 1: call retrofitbuilder with proper baseurl and class

        Maya maya = RetrofitBuilder.RetrofitBuilderFunction(mayaurl).create(Maya.class);

        //STEP 2: assign the observable with proper interface

        Observable<Example> qlist=maya.getAllqueue();

        //STEP 3: just maintain this

        qlist.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<Example>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Log.e("tab",e.toString());
            }

            @Override
            public void onNext(Example questionDetailsList) {
                Log.e("tab",questionDetailsList.status);
                Log.e("tab",questionDetailsList.data.get(0).get(0).body);
                Log.e("tab",questionDetailsList.data.get(0).get(1).body);
                Log.e("tab",questionDetailsList.data.get(0).get(2).body);
            }
        });
    }
}
