package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	// what are the beans?
	// what are the dependencies of a bean?
	// where to search for beans? => No need because all beans are in the same package.

	public static void main(String[] args) {
		// Spring will take care of it.
		// BinarySearchImpl binaraySearch = new BinarySearchImpl(new QuickSortSortAlgorithm());

		// Application Context
//		SpringApplication.run(SpringIn5StepsApplication.class, args);
//		ApplicationContext applicationContext =
//				SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		// Using spring core/java instead o spring boot
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
	//		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearch);
	//		System.out.println(binarySearch1);
			int result =
					binarySearch.binarySearch(new int[] {123, 4, 6}, 3);
			System.out.println(result);
		}
	}
}
