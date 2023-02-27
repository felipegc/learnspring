package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXMLContext {

	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			LOGGER.info("Beans Loaded => {}", (Object)applicationContext.getBeanDefinitionNames());
			for (String beanName: applicationContext.getBeanDefinitionNames()) {
				LOGGER.info("Bean Loaded => {}", beanName);
			}


			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}", xmlPersonDAO);
		}
	}
}
