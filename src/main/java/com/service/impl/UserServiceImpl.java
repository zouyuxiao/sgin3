package com.service.impl;

import com.bean.User;
import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.UserService;

import java.util.List;

/**
 * Created by ${邹} on 2019/1/11.
 * 描述：
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public long register(User user) {
        return userDao.register( user );
    }

    @Override
    public User login(String name) {
        return userDao.login( name );
    }

    @Override
    public List<User> login2() {
        return userDao.login2();
    }
}
