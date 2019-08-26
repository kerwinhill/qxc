package com.qxc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//DAO接口扫描--mybatis的注解
//@MapperScan("com.kerwin.usermanager.mapper")
//这一个表示开启一个扫描器，spring注解扫描
@ComponentScan("com")
@EnableScheduling
@EnableCaching
@SpringBootApplication()
@MapperScan("com.qxc.dao")
@EnableTransactionManagement
public class RunningApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunningApplication.class, args);
    }
}
