package com.nanny.demo.dao.mapper;

import com.nanny.demo.dao.pojo.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DemoMapper {
    @Select(" SELECT `col1`,`col2`,`col3` FROM `lock_test` WHERE `col1`=#{pk} ")
    City getCityByPrimaryKey(@Param("pk") int pk);
}
