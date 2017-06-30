package com.sam.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@MapperScan(basePackages = "com.sam.mybatis.dao")
public class SpringbootMybatis02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatis02Application.class, args);
	}
}
