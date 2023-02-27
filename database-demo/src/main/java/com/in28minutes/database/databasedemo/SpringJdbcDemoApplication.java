package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 10001 -> {}", dao.findById(10001));
		logger.info("Users by name \"Peter\" -> {}", dao.findByName("Peter"));
		logger.info("Users by name like \"Fe\" -> {}", dao.findByNameContent("Fe"));
		logger.info("Deleting 10002 -> N of Rows deleted - {}", dao.deleteById(10002));
		logger.info("Deleting Name like Fe -> N of Rows deleted - {}", dao.deleteByNameContent("Fe"));
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date birthDate = dateFormat.parse("19/11/1989");
		logger.info("Inserting person - {}", dao.insert(new Person(20001, "Leticia", "Brazil", birthDate)));
		logger.info("Updating person by id 10001 - {}", dao.updateById(new Person(10001, "Frederico", "India", birthDate)));
	}
}
