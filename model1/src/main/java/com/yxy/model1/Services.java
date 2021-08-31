package com.yxy.model1;


import com.yxy.router.app.AppService;
import com.yxy.router.module2.Module2Service;
import com.yxy.structure.AppJoint;

public class Services {

    public static AppService sAppService = AppJoint.service(AppService.class);

    public static Module2Service sModule2Service = AppJoint.service(Module2Service.class);
}
