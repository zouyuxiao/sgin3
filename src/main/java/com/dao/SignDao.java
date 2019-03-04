package com.dao;

import com.bean.Sign;

import java.util.List;

/**
 * Created by ${邹} on 2019/2/25.
 * 描述：
 */
public interface SignDao {
    long insert(Sign sign);
    List<Sign> list();
    Sign findById(Long id);
}
