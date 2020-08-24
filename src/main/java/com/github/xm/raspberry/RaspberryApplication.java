package com.github.xm.raspberry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.github.xm.raspberry.dao")
public class RaspberryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RaspberryApplication.class, args);
    }

}
