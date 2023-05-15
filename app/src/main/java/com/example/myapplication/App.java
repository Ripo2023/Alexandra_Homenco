package com.example.myapplication;

import android.app.Application;
import android.content.SharedPreferences;

public class App extends Application
{
    @Override
    public SharedPreferences getSharedPreferences(String name, int mode) {
        return super.getSharedPreferences(name, mode);
    }
}
