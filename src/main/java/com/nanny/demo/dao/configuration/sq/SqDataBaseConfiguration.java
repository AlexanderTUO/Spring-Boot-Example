package com.nanny.demo.dao.configuration.sq;

import com.nanny.demo.dao.configuration.DaoConfigurationBase;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "sq.datasource")
@MapperScan(basePackages = "com.nanny.demo.dao.mapper.sq",
        sqlSessionFactoryRef = "sqSession")
public class SqDataBaseConfiguration extends DaoConfigurationBase {

    @Bean("sqSession")
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        return super.sqlSessionFactory();
    }
}
