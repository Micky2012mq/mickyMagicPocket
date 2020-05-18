package com.micky.mgpkt.mkspkt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.micky.mgpkt.mkspkt.mapper")
public class MkspktApplication {

    public static void main(String[] args) {
        SpringApplication.run(MkspktApplication.class, args);
    }

}
