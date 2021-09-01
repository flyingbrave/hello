package com.yxy.runmodel1.mock;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.yxy.router.app.AppService;

public class AppServiceMock implements AppService {
    @Override
    public String callMethodSyncOfApp() {
        return "mock str AppService model1 ";
    }

    @Override
    public void startActivityOfApp(Context context) {

    }

    @Override
    public Fragment obtainFragmentOfApp() {
        return null;
    }
}
