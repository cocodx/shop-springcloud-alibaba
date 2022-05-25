package com.liugang.alibabacloud.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//开启事务支持
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(value = { "com.liugang.alibabacloud.user.mapper" })
public class UserStater {

    public static void main(String[] args) {
        SpringApplication.run(UserStater.class,args);
    }
}
