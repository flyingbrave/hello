package com.yxy.router.app;

import android.content.Context;
import android.database.Observable;

import androidx.fragment.app.Fragment;

import com.yxy.router.app.callback.AppCallback;
import com.yxy.router.app.entity.AppEntity;


public interface AppService {

    /**
     * 普通的同步方法调用
     */
    String callMethodSyncOfApp();


    /*
     * 启动 App 模块的 Activity
     */
    void startActivityOfApp(Context context);

    /*
     * 调用 App 模块的 Fragment
     */
    Fragment obtainFragmentOfApp();
}
