package com.yxy.hello

import android.util.Log
import com.yxy.common.AppBase
import com.yxy.structure.core.AppSpec


/**
 * Created by zhounl on 2017/11/28.
 */
@AppSpec
class App : AppBase() {
  override fun onCreate() {
    super.onCreate()
    Log.i("app", "app init is called")
  }
}
