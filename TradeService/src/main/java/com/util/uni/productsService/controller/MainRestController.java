package com.util.uni.productsService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.util.uni.productsService.kafka.MyKafkaProducer;

@RestController
@EnableAutoConfiguration
public class MainRestController {
	private static final Logger logger = LoggerFactory.getLogger(MainRestController.class);
	
	@Autowired
	private MyKafkaProducer myKafkaProducer;
	
	public void setMyKafkaProducer(MyKafkaProducer myKafkaProducer) {
		this.myKafkaProducer = myKafkaProducer;
	}
	
	@RequestMapping(value="/post", method= RequestMethod.POST)
	public void sendMessage(@RequestParam("msg") String msg) {
		myKafkaProducer.publishtoKafkaTopic(msg);
	}
}


