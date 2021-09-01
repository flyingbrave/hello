package com.yxy.model2;

import android.util.Log;

import com.yxy.common.AppBase;
import com.yxy.structure.core.ModuleSpec;


@ModuleSpec(priority = 1)
public class Module2Application extends AppBase {

    @Override
    public void onCreate() {
        super.onCreate();
        // do module2 initialization
        Log.i("tag5","Module2222Application  oncreate");
    }
}
