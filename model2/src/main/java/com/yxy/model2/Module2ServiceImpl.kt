package com.yxy.model2

import android.content.Context
import com.yxy.router.module2.Module2Service
import com.yxy.structure.core.ServiceProvider


@ServiceProvider
class Module2ServiceImpl : Module2Service {


  override fun callMethodSyncOfModule2(): String {
    return "syncMethodResultModule2"
  }


}