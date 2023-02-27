package com.in28minutes.spring.aop.springaop;

import com.in28minutes.spring.aop.springaop.business.Business1;
import com.in28minutes.spring.aop.springaop.business.Business2;
import com.in28minutes.spring.aop.springaop.business.Business3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(SpringAopApplication.class);

	@Autowired
	Business1 business1;

	@Autowired
	Business2 business2;

	@Autowired
	Business3 business3;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	public void run(String... args) throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
		logger.info(business3.calculateSomething());
	}
}
