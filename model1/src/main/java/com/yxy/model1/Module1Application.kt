package com.yxy.model1

import android.util.Log
import com.yxy.common.AppBase
import com.yxy.structure.core.ModuleSpec


@ModuleSpec(priority = 2)
open class Module1Application : AppBase() {

  override fun onCreate() {
    super.onCreate()
    // do module1 initialization
    Log.i("module1", "module1 init is called")
  }
}
