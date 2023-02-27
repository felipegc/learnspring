package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsSomeCDIApplication {

	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsSomeCDIApplication.class);

	public static void main(String[] args) {
//		ApplicationContext applicationContext =
//				SpringApplication.run(SpringIn5StepsSomeCDIApplication.class, args);
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsSomeCDIApplication.class);
		SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);
		LOGGER.info("{} dao-{}", someCDIBusiness, someCDIBusiness.getSomeCdiDao());
	}

}
