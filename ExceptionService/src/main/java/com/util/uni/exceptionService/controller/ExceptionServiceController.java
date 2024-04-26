package com.util.uni.exceptionService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;


import java.util.Date;

@RestController
@EnableAutoConfiguration
public class ExceptionServiceController {
	private static final Logger logger = LoggerFactory.getLogger(ExceptionServiceController.class);

	@GetMapping(value="/getHealth")
	public String getHealth() {
		return "Exception Service is running "+ new Date().toString();
	}
}


