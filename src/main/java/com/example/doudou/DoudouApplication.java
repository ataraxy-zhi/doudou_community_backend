package com.example.doudou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com/example/doudou/mapper")
@SpringBootApplication
public class DoudouApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoudouApplication.class, args);
    }

}
