package com.yxy.model2;

import android.content.Context;

import com.yxy.router.module2.Module2Service;
import com.yxy.structure.core.ServiceProvider;

@ServiceProvider
public class Module2ServiceImpl implements Module2Service {
    @Override
    public String callMethodSyncOfModule2() {
        return "mode2 返回数据";
    }

    @Override
    public void jump2Mode2MainActivity(Context context) {
        Model2MainActivity.jump(context);
    }
}
