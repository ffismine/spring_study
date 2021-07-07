package com.kstudy.dao;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("获取Mysql用户数据");
    }
}
