package com.nanny.demo.dao.mapper.sq;

import com.nanny.demo.dao.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SqDemoMapper {
    @Select(" SELECT `id`,`name` FROM `user` WHERE `id` = #{id}")
    public User getUserById(@Param("id") int id);
}
