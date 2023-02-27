package com.in28minutes.spring.basics.springin5steps.scope;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


//@Component
// Component is used for generic beans which repository intends to work with data layer
@Repository
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {

//    Logger LOGGER =
//            LoggerFactory.getLogger(PersonDAO.class);

    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
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
