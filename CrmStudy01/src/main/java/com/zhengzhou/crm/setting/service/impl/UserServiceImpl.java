package com.zhengzhou.crm.setting.service.impl;

import com.zhengzhou.crm.setting.dao.UserDao;
import com.zhengzhou.crm.setting.service.UserService;
import com.zhengzhou.crm.until.SqlSessionUntil;

public class UserServiceImpl implements UserService {
    private UserDao userDao = SqlSessionUntil.getSession().getMapper(UserDao.class);

}
