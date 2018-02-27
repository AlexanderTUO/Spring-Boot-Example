package com.nanny.demo.dao.configuration.sq;

import com.nanny.demo.dao.configuration.DaoConfigurationBase;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ConfigurationProperties(prefix = "sq.datasource")
@MapperScan(basePackages = "com.nanny.demo.dao.mapper.sq",
        sqlSessionFactoryRef = "sqSession")
public class SqDataBaseConfiguration extends DaoConfigurationBase {

    @Bean("sqDatabase")
    public DataSource getDataSource() {
        return super.dataSource();
    }

    @Bean("sqSession")
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        return super.sqlSessionFactory();
    }
}
