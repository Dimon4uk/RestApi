package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.main.repository")
@EntityScan(basePackages = "com.main.model")
@SpringBootApplication
@ComponentScan(basePackages = "com.main")
public class RestApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}
}
