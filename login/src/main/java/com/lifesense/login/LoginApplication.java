package com.lifesense.login;

/*
 *  @项目名：  ComponentDemo
 *  @包名：    com.lifesense.login
 *  @文件名:   LoginApplication
 *  @创建者:   lz
 *  @创建时间:  2020/8/18 11:26
 *  @描述：
 */

import android.app.Application;

import com.lifesense.base.BaseApp;
import com.lifesense.componentbase.ServiceFactory;
import com.lifesense.login.service.AccountService;

public class LoginApplication extends BaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }
    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setAccountService(new AccountService());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
