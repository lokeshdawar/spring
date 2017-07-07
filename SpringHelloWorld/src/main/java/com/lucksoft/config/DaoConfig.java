package com.lucksoft.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DaoConfig {
	
	@Bean(destroyMethod = "close")
    DataSource dataSource() {
        HikariConfig dataSourceConfig = new HikariConfig();
        dataSourceConfig.setDriverClassName("com.mysql.jdbc.Driver");
        dataSourceConfig.setJdbcUrl("jdbc:mysql://localhost:3306/TESTDB");
        dataSourceConfig.setUsername("testuser");
        dataSourceConfig.setPassword("testuser");
 
        return new HikariDataSource(dataSourceConfig);
    }

}
