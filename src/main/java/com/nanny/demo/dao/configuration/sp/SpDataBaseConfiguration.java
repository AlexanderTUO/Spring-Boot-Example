package com.nanny.demo.dao.configuration.sp;

import com.nanny.demo.dao.configuration.DaoConfigurationBase;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ConfigurationProperties(prefix = "sp.datasource")
@MapperScan(basePackages = "com.nanny.demo.dao.mapper.sp",
        sqlSessionFactoryRef = "spSession")
public class SpDataBaseConfiguration extends DaoConfigurationBase {

    @Bean("spDatabase")
    public DataSource getDataSource() {
        return super.dataSource();
    }

    @Bean("spSession")
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        return super.sqlSessionFactory();
    }
}
