package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
// By default, the SpringBootApplication looks for the package where it resides("com.in28minutes.spring.basics.springin5steps")
// We are scanning the package springin5steps but the componentscan classes are outside of it.
// We can tell spring to analyze another packages by:
//@ComponentScan("com.in28minutes.spring.basics.componentscan")
@Configuration
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
//		ApplicationContext applicationContext =
//				SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("hahahaha");
		System.out.println(componentDAO);
	}


}
