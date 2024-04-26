package com.util.uni.exceptionService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootConfiguration
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ExceptionServiceBootApp {
	private static final Logger logger = LoggerFactory.getLogger(ExceptionServiceBootApp.class);
	public static void main(String[] args) {
		SpringApplication.run(ExceptionServiceBootApp.class, args);
	}

}
