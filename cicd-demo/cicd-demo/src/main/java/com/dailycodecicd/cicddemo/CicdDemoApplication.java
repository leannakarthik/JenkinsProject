package com.dailycodecicd.cicddemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdDemoApplication {

	public static final Logger logger = LoggerFactory.getLogger(CicdDemoApplication.class);
	public static void main(String[] args) {
		logger.info("its a continuous integration job");
		SpringApplication.run(CicdDemoApplication.class, args);
	}

//	@Override
//	public void run(String args) throws Exception{
//		logger.info("its mysecond logger");
//	}
}
