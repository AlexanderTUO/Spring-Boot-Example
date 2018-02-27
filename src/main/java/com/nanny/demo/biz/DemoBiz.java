package com.nanny.demo.biz;

import com.nanny.demo.dao.mapper.sp.SpDemoMapper;
import com.nanny.demo.dao.mapper.sq.SqDemoMapper;
import com.nanny.demo.dao.pojo.City;
import com.nanny.demo.dao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoBiz {

    private SpDemoMapper spDemoMapper;
    private SqDemoMapper sqDemoMapper;

    @Autowired
    DemoBiz(SpDemoMapper spMapper, SqDemoMapper sqMapper) {
        this.spDemoMapper = spMapper;
        this.sqDemoMapper = sqMapper;
    }

    public City getCityByPrimaryKey(int pk) {
        return spDemoMapper.getCityByPrimaryKey(pk);
    }

    public User getUserById(int id) {
        return sqDemoMapper.getUserById(id);
    }
}
