package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRespository;
import com.in28minutes.database.databasedemo.springdata.PersonSpringDataRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonSpringDataRespository respository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("User id 10001 -> {}", respository.findById(10001));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = dateFormat.parse("19/11/1989");
        logger.info("Inserting person - {}", respository.save(new Person("Leticia", "Brazil", birthDate)));
        logger.info("Updating person - {}", respository.save(new Person(10003, "UpdateName", "CHINA", birthDate)));
        respository.deleteById(10001);
        logger.info("User id 10001 -> {}", respository.findById(10001));
        logger.info("All persons -> {}", respository.findAll());

    }
}
