package com.service;

import com.bean.Sign;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ${邹} on 2019/2/25.
 * 描述：
 */
@Repository
public interface SginService {
    long insert(Sign sign);
    List<Sign> list();
    Sign findById(Long id);
}
