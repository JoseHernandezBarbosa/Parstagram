package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("27XC4tJA6uMgpbyhjUM0Zggj3fxp1VDegDhl3Db0")
                .clientKey("Zc7GOCYYEiHUBAoiy5DAqaVHFsvQt7Brlo7lodsB")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
