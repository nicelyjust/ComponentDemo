package com.lifesense.componentbase.service;

/*
 *  @项目名：  ComponentDemo
 *  @包名：    com.lifesense.componentbase.service
 *  @文件名:   EmptyAccountService
 *  @创建者:   lz
 *  @创建时间:  2020/8/18 10:51
 *  @描述：
 */

public class EmptyAccountService implements IAccountService{
    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountID() {
        return null;
    }
}
