//package com.saber.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.sql.DataSource;
//
//@Configuration
////@EnableConfigurationProperties(JdbcProperties.class)
//public class JdbcConfig {
//
////    @Value("${jdbc.url}")
////    String url;
////    @Value("${jdbc.driverClassName}")
////    String driverClassName;
////    @Value("${jdbc.username}")
////    String username;
////    @Value("${jdbc.password}")
////    String password;
//
//
////    @Bean
////    public DataSource dataSource(JdbcProperties properties){
////        DruidDataSource druidDataSource=new DruidDataSource();
////        druidDataSource.setUrl(properties.getUrl());
////        druidDataSource.setPassword(properties.getPassword());
////        druidDataSource.setUsername(properties.getUsername());
////        druidDataSource.setDriverClassName(properties.getDriverClassName());
////        return druidDataSource;
////    }
////    @Bean
////    @ConfigurationProperties(prefix = "jdbc")
////    public DataSource dataSource(){
////        return new DruidDataSource();
////    }
//}
