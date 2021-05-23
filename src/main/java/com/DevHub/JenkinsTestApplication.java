package com.DevHub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

	public static Logger logger=LoggerFactory.getLogger(JenkinsTestApplication.class);
	
	public static void main(String[] args) {
		logger.info("Application Started");
		logger.info("Application is getting Executed......");
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

}
