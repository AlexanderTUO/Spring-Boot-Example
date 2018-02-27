package com.nanny.demo.dao.configuration.sp;

import com.nanny.demo.dao.configuration.DaoConfigurationBase;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "sp.datasource")
@MapperScan(basePackages = "com.nanny.demo.dao.mapper.sp",
        sqlSessionFactoryRef = "spSession")
public class SpDataBaseConfiguration extends DaoConfigurationBase {

    @Bean("spSession")
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        return super.sqlSessionFactory();
    }
}
