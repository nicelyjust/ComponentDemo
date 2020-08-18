package com.lifesense.component;

/*
 *  @项目名：  ComponentDemo
 *  @包名：    com.lifesense.component
 *  @文件名:   MainApplication
 *  @创建者:   lz
 *  @创建时间:  2020/8/18 14:16
 *  @描述：
 */

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lifesense.base.AppConfig;
import com.lifesense.base.BaseApp;

public class MainApplication extends BaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化 ARouter
        if (BuildConfig.DEBUG) {
            // 这两行必须写在init之前，否则这些配置在init过程中将无效

            // 打印日志
            ARouter.openLog();
            // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.openDebug();
        }

        // 初始化 ARouter
        ARouter.init(this);

        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        //反射
        for (String moduleApp : AppConfig.moduleApps) {
            try {
                Class<Application> aClass = (Class<Application>) Class.forName(moduleApp);
                BaseApp baseApp = (BaseApp) aClass.newInstance();
                baseApp.initModuleApp(application);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void initModuleData(Application application) {
        for (String moduleApp : AppConfig.moduleApps) {
            try {
                Class<Application> aClass = (Class<Application>) Class.forName(moduleApp);
                BaseApp baseApp = (BaseApp) aClass.newInstance();
                baseApp.initModuleData(application);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }
}
