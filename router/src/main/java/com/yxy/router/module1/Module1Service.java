package com.yxy.router.module1;


import android.content.Context;

import androidx.fragment.app.Fragment;

public interface Module1Service {



    /**
     * 普通的同步方法调用
     */
    String callMethodSyncOfModule1();

    void startActivityOfModule1(Context context);

    Fragment obtainFragmentOfModule1();


}
