package com.yxy.model1;

import android.util.Log;

import com.yxy.common.AppBase;
import com.yxy.structure.core.ModuleSpec;

//priority值越大越后执行
@ModuleSpec(priority = 2)
public class Module1Application extends AppBase {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("tag5","Module1Application  oncreate");
    }
}
