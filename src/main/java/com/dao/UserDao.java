package com.dao;

import com.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ${邹} on 2019/1/11.
 * 描述：
 */
@Repository
public interface UserDao {
    long register(User user);
    User login(String name);
    List<User> login2();
}
