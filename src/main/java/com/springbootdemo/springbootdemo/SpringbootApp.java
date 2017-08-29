package com.springbootdemo.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.springbootdemo"})
@EntityScan("com.springbootdemo.model")
@EnableJpaRepositories("com.springbootdemo.dao")
public class SpringbootApp {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApp.class, args);
	}

}
