package com.yxy.runmodel1;

import android.util.Log;

import com.yxy.model1.Module1Application;
import com.yxy.model1.Services;
import com.yxy.runmodel1.mock.AppServiceMock;
import com.yxy.runmodel1.mock.Model2ServiceMock;

public class Model1AppIndependent extends Module1Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("tag5", "Model1AppIndependent init is called");
        Services.sAppService = new AppServiceMock();
        Services.sModule2Service = new Model2ServiceMock();
    }
}
