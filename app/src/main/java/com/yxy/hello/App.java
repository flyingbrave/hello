package com.yxy.hello;

import android.util.Log;

import com.yxy.common.AppBase;
import com.yxy.structure.core.AppSpec;

@AppSpec
public class App extends AppBase {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("tag5","App  onCreate");
    }
}
