package com.yxy.runmodel2;

import android.util.Log;

import com.yxy.model2.Module2Application;

public class Model2AppIndependent extends Module2Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("tag5", "Model2AppIndependent init is called");
    }
}
