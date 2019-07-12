package com.example.v_power;

import android.app.Application;
import com.backendless.Backendless;
import com.backendless.BackendlessUser;

public class TestApplication extends Application {

        public static final String APPLICATION_ID = "EACC6913-C5EC-BC0F-FF2E-38E1B808F800";
        public static final String API_KEY = "EA713050-1135-4034-A97F-D4D18DB21E62";
        public static final String SERVER_URL = "http://api.backendless.com";


        public static BackendlessUser user;



    @Override
    public void onCreate() {
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
        super.onCreate();
    }
}
