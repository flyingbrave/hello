package com.yxy.hello;


import android.content.Context;

import androidx.fragment.app.Fragment;

import com.yxy.router.app.AppService;
import com.yxy.structure.core.ServiceProvider;

/**
 * AppService 的另外一个实现
 */
@ServiceProvider("another")
public class AppServiceImpl2 implements AppService {

  @Override
  public String callMethodSyncOfApp() {
    return "AppServiceImpl2 callMethodSyncOfApp";
  }

  @Override
  public void startActivityOfApp(Context context) {

  }

  @Override
  public Fragment obtainFragmentOfApp() {
    return null;
  }
}
