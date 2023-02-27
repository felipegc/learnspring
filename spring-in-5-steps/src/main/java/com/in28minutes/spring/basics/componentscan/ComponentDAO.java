package com.in28minutes.spring.basics.componentscan;

import com.in28minutes.spring.basics.componentscan.ComponentJdbcConnection;
import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Repository
public class ComponentDAO {
    Logger LOGGER =
            LoggerFactory.getLogger(ComponentDAO.class);

    @Autowired
    ComponentJdbcConnection jdbcConnection;

    public ComponentJdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

//    @PostConstruct
//    public void postConstruct() {
//        LOGGER.info("postConstruct");
//    }
//
//    @PreDestroy
//    public void preDestroy() {
//        LOGGER.info("pre destroy");
//    }
}
