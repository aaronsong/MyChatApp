package com.example.sdsa.mychatapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import model.Message;

/**
 * Created by SDSA on 9/28/2015.
 */
public class ChattApplication extends Application {

    public static final String APPLICATION_ID = "aiwzxOL65lyUJUrafxTwfeNk4LcUIdEyXg6Zusv6";
    public static final String CLIENT_KEY = "wUmajQIqhZ11F441QUnHmu9qajWnRU86D1vaFp6z";

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);

        ParseObject.registerSubclass(Message.class);
        Parse.initialize(this, APPLICATION_ID, CLIENT_KEY);
    }
}
