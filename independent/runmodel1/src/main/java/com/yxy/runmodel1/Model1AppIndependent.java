package com.yxy.runmodel1;

import android.util.Log;

import com.yxy.model1.Module1Application;

public class Model1AppIndependent extends Module1Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("tag5", "Model1AppIndependent init is called");
    }
}
