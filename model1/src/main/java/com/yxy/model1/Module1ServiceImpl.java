package com.yxy.model1;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.yxy.router.module1.Module1Service;
import com.yxy.structure.core.ServiceProvider;

@ServiceProvider
public class Module1ServiceImpl implements Module1Service {
    @Override
    public String callMethodSyncOfModule1() {
        return "model 1返回数据";
    }

    @Override
    public void startActivityOfModule1(Context context) {
        Model1MainActivity.jump(context);
    }

    @Override
    public Fragment obtainFragmentOfModule1() {
       return Model1Fragment.newInstance();
    }
}
