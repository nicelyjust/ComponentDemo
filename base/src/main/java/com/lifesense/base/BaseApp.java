package com.lifesense.base;

/*
 *  @项目名：  ComponentDemo
 *  @包名：    com.lifesense.base
 *  @文件名:   BaseApp
 *  @创建者:   lz
 *  @创建时间:  2020/8/18 11:20
 *  @描述：
 */

import android.app.Application;

public abstract class BaseApp extends Application {
    /**
     * Application 初始化
     */
    public abstract void initModuleApp(Application application);

    /**
     * 所有 Application 初始化后的自定义操作
     */
    public abstract void initModuleData(Application application);
}
