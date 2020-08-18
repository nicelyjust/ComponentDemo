package com.lifesense.login.service;

/*
 *  @项目名：  ComponentDemo
 *  @包名：    com.lifesense.login
 *  @文件名:   AccountService
 *  @创建者:   lz
 *  @创建时间:  2020/8/18 11:35
 *  @描述：    通过此服务实现其他组件与之传递数据
 */

import com.lifesense.componentbase.service.IAccountService;
import com.lifesense.login.manager.UserManager;

public class AccountService implements IAccountService {
    @Override
    public boolean isLogin() {
        return UserManager.getInstance().isLogin();
    }

    @Override
    public String getAccountID() {
        return UserManager.getInstance().getUserInfo().accountID;
    }
}
