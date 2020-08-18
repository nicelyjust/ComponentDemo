package com.lifesense.login.manager;

/*
 *  @项目名：  ComponentDemo
 *  @包名：    com.lifesense.login.manager
 *  @文件名:   UserManager
 *  @创建者:   lz
 *  @创建时间:  2020/8/18 11:37
 *  @描述：
 */

import com.lifesense.login.UserInfo;

public class UserManager {
    private UserInfo mUserInfo;

    private UserManager() {
    }

    public static UserManager getInstance() {
        return Singleton.sUserManager;
    }

    private static class Singleton {
        private static UserManager sUserManager = new UserManager();
    }

    public void saveUser(UserInfo userInfo) {
        mUserInfo = userInfo;
    }

    public UserInfo getUserInfo() {
        return mUserInfo;
    }

    public boolean isLogin() {
        return getUserInfo() != null;
    }
}
