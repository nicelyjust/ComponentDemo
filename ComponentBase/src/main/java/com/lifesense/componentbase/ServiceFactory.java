package com.lifesense.componentbase;

import com.lifesense.componentbase.service.EmptyAccountService;
import com.lifesense.componentbase.service.IAccountService;

/*
 *  @项目名：  ComponentDemo
 *  @包名：    com.lifesense.componentbase.service
 *  @文件名:   ServiceFactory
 *  @创建者:   lz
 *  @创建时间:  2020/8/18 10:22
 *  @描述：
 */
public class ServiceFactory {

    private IAccountService mAccountService;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return Singleton.sServiceFactory;
    }

    public void setAccountService(IAccountService accountService) {
        mAccountService = accountService;
    }

    public IAccountService getAccountService() {
        if (mAccountService == null)
            mAccountService = new EmptyAccountService();
        return mAccountService;
    }

    static class Singleton {
        private static ServiceFactory sServiceFactory = new ServiceFactory();
    }


}