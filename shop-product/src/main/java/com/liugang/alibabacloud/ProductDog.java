package com.liugang.alibabacloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan(value = {"com.liugang.alibabacloud.mapper"})
@EnableTransactionManagement(proxyTargetClass = true)
public class ProductDog {
}
