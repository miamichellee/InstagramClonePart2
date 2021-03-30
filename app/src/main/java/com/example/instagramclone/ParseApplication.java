package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("7uvp7TfkqMwXrbFyQqGjiOV0Hks1k62iiS9XYz61")
                .clientKey("NAGsLf84rbNpL8rAwuAs9YChSnfMybGmdJCxcilq")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
