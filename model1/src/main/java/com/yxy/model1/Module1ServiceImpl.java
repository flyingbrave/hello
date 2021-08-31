package com.yxy.model1;

import com.yxy.router.module1.Module1Service;
import com.yxy.structure.core.ServiceProvider;

@ServiceProvider
public class Module1ServiceImpl implements Module1Service {
    @Override
    public String callMethodSyncOfModule1() {
        return "model 1返回数据";
    }
}
