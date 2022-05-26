package com.liugang.alibabacloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


public class ProductStarter {

    public static void main(String[] args) {
        //为什么要把这个类传进来
        //读取这个类上的注解呀
        SpringApplication.run(ProductDog.class,args);
    }
}
