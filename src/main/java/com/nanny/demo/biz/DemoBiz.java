package com.nanny.demo.biz;

import com.nanny.demo.dao.mapper.DemoMapper;
import com.nanny.demo.dao.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoBiz {
    private DemoMapper demoMapper;

    @Autowired
    DemoBiz(DemoMapper mapper) {
        this.demoMapper = mapper;
    }

    public City getCityByPrimaryKey(int pk) {
        return demoMapper.getCityByPrimaryKey(pk);
    }
}
