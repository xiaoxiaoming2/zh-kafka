package com.zh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zh.dao")
public class ZhKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhKafkaApplication.class, args);
	}

}
