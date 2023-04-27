package com.lee.hjboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lee.hjboard")
public class HjboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HjboardApplication.class, args);
	}

}
