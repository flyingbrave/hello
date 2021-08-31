package com.yxy.model2;


import com.yxy.router.app.AppService;


import com.yxy.router.module1.Module1Service;
import com.yxy.structure.AppJoint;

public class Services {

  public static AppService sAppService = AppJoint.service(AppService.class,"another");

  public static Module1Service sModule1Service = AppJoint.service(Module1Service.class);
}
