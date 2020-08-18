package com.lifesense.componentbase.service;

/*
 *  @项目名：  ComponentDemo
 *  @包名：    com.lifesense.componentbase.service
 *  @文件名:   IAccountService
 *  @创建者:   lz
 *  @创建时间:  2020/8/18 10:22
 *  @描述：    定义了Login组件向外提供的数据传递的接口方法,大白话:你需要从该组件得到什么东西
 */

public interface IAccountService {
    boolean isLogin();
    String getAccountID();
}
