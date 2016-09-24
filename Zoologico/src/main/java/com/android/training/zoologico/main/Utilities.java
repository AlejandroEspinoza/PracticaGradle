package com.android.training.zoologico.main;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.android.training.zoologico.BuildConfig;

/**
 * Created by Alejandro on 9/6/16.
 */
public class Utilities {
    public static String getAppVersionName(){
        return BuildConfig.VERSION_NAME;
    }

    public static String getAppId(){
        return BuildConfig.APPLICATION_ID;
    }

    public static String getAppVersionCode(){
        return String.valueOf(BuildConfig.VERSION_CODE);
    }
}