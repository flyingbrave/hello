package com.yxy.structure;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.util.Log;

import com.yxy.structure.util.BinaryKeyMap;

import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;



/**
 * Created by zhounl on 2017/11/15.
 */

public class AppJoint {

    private List<Application> moduleApplications = new ArrayList<>();

    private BinaryKeyMap<Class, String, Class> routersMap = new BinaryKeyMap<>();

    private SoftReference<BinaryKeyMap<Class, String, Object>> softRouterInstanceMap = new SoftReference<>(new BinaryKeyMap<>());

    public static final String DEFAULT_NAME = "__app_joint_default";

    private AppJoint() { }

    public void attachBaseContext(Context context) {
        for (Application app : moduleApplications) {
            try {
                // invoke each application's attachBaseContext
                Method attachBaseContext = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
                attachBaseContext.setAccessible(true);
                attachBaseContext.invoke(app, context);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public void onCreate() {
        for (Application app : moduleApplications) {
            app.onCreate();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        for (Application app : moduleApplications) {
            app.onConfigurationChanged(configuration);
        }
    }

    public void onLowMemory() {
        for (Application app : moduleApplications) {
            app.onLowMemory();
        }
    }

    public void onTerminate() {
        for (Application app : moduleApplications) {
            app.onTerminate();
        }

    }

    public void onTrimMemory(int level) {
        for (Application app : moduleApplications) {
            app.onTrimMemory(level);
        }
    }

    public static synchronized <T> T service(Class<T> routerType) {
        return service(routerType, DEFAULT_NAME);
    }

    public static synchronized <T> T service(Class<T> routerType, String name) {
        T requiredRouter = (T) get().getRouterInstanceMap().get(routerType, name);
        if (requiredRouter == null) {
            try {
                requiredRouter = (T) get().routersMap.get(routerType, name).newInstance();
                get().getRouterInstanceMap().put(routerType, name, requiredRouter);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        return requiredRouter;
    }

    public List<Application> moduleApplications() {
        return moduleApplications;
    }

    public BinaryKeyMap<Class, String, Object> getRouterInstanceMap() {
        if (softRouterInstanceMap.get() == null) {
            softRouterInstanceMap = new SoftReference<>(new BinaryKeyMap<>());
        }
        return softRouterInstanceMap.get();
    }

    //通过字节码操作，将ServiceProvider注解标记的类添加到这个map中去
    public BinaryKeyMap<Class, String, Class> routersMap() {
        return routersMap;
    }

    public static AppJoint get() {
        return SingletonHolder.INSTANCE;
    }

    static class SingletonHolder {
        static AppJoint INSTANCE = new AppJoint();
    }
}