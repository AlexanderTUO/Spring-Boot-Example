package com.nanny.demo.dao.mapper.sp;

import com.nanny.demo.dao.pojo.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SpDemoMapper {
    @Select(" SELECT `col1`,`col2`,`col3` FROM `lock_test` WHERE `col1`=#{pk} ")
    City getCityByPrimaryKey(@Param("pk") int pk);
}
