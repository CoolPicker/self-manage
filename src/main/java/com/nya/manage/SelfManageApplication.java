package com.nya.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.nya.manage.mapper")
@EnableScheduling
@SpringBootApplication
public class SelfManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelfManageApplication.class, args);
    }

}
