package com.util.uni.productsService;

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
public class ProductServiceMainSpringBootApp {
	private static final Logger logger = LoggerFactory.getLogger(ProductServiceMainSpringBootApp.class);
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceMainSpringBootApp.class, args);
	}

}
