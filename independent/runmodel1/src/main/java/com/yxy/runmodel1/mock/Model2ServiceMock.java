package com.yxy.runmodel1.mock;

import android.content.Context;

import com.yxy.router.module2.Module2Service;

public class Model2ServiceMock implements Module2Service {
    @Override
    public String callMethodSyncOfModule2() {
        return "Model2ServiceMock";
    }

    @Override
    public void jump2Mode2MainActivity(Context context) {

    }
}
