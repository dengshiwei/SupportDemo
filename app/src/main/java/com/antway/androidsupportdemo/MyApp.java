package com.antway.androidsupportdemo;

import android.app.Application;

import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SensorsAnalyticsAutoTrackEventType;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;

public class MyApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        String SA_SERVER_URL = "数据接收地址";


        SAConfigOptions saConfigOptions = new SAConfigOptions(SA_SERVER_URL);
        saConfigOptions.setAutoTrackEventType(SensorsAnalyticsAutoTrackEventType.APP_CLICK |
                        SensorsAnalyticsAutoTrackEventType.APP_START |
                        SensorsAnalyticsAutoTrackEventType.APP_END |
                        SensorsAnalyticsAutoTrackEventType.APP_VIEW_SCREEN)
                //开启 Log
                .enableLog(true);
        SensorsDataAPI.startWithConfigOptions(this, saConfigOptions);
        SensorsDataAPI.sharedInstance().trackFragmentAppViewScreen();
    }
}
