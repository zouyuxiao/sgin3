package com.service.impl;

import com.bean.Sign;
import com.dao.SignDao;
import com.service.SginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ${邹} on 2019/2/25.
 * 描述：
 */
@Service
public class SginServiceImpl implements SginService {
    @Autowired
    private SignDao signDao;
    @Override
    public long insert(Sign sign) {
        return signDao.insert( sign );
    }

    @Override
    public List<Sign> list() {
        return signDao.list();
    }
}
