package com.yxy.model1


import com.yxy.router.module1.Module1Service
import com.yxy.structure.core.ServiceProvider



@ServiceProvider
 class Module1ServiceImpl : Module1Service {

  override fun callMethodSyncOfModule1(): String {
    return "syncMethodResultModule1"
  }

}
