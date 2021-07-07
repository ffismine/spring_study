package com.kstudy.service;

import com.kstudy.dao.UserDao;
import com.kstudy.dao.UserDaoImpl;
import com.kstudy.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{
    // 修改前
//    UserDao userDao = new UserDaoImpl();
//    UserDao userDao = new UserDaoMysqlImpl();

    // 修改后：
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
