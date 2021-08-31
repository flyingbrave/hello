package com.yxy.hello;

import android.content.Context;
import android.content.Intent;
import android.database.Observable;

import androidx.fragment.app.Fragment;

import com.yxy.router.app.AppService;
import com.yxy.structure.core.ServiceProvider;


/**
 * 组件化过程不可能一蹴而就，组件化的过程是 App 模块渐渐 “瘦身”的过程
 * 最终 App 模块仅仅作为整个应用的一个 “application 壳”，但是组件化
 * 的过程是缓慢的，我们要允许在组件化的过程中，子模块依然可以调用 App
 * 模块内的方法
 */
@ServiceProvider
public class AppServiceImpl implements AppService {

    @Override
    public String callMethodSyncOfApp() {
        return "App service 111  的实现类文字返回";
    }

    @Override
    public void startActivityOfApp(Context context) {

    }

    @Override
    public Fragment obtainFragmentOfApp() {
        return null;
    }
}
