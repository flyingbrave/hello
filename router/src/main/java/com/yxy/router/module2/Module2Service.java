package com.yxy.router.module2;

import android.content.Context;
import android.database.Observable;

import androidx.fragment.app.Fragment;

import com.yxy.router.module2.callback.Module2Callback;
import com.yxy.router.module2.entity.Module2Entity;


public interface Module2Service {



    /**
     * 普通的同步方法调用
     */
    String callMethodSyncOfModule2();


}
