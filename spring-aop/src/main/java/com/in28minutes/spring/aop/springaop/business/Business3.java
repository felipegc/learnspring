package com.in28minutes.spring.aop.springaop.business;

import com.in28minutes.spring.aop.springaop.aspect.AfterAopAspect;
import com.in28minutes.spring.aop.springaop.data.Dao1;
import com.in28minutes.spring.aop.springaop.data.Dao3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business3 {
    private Logger logger = LoggerFactory.getLogger(Business3.class);
    @Autowired
    private Dao3 dao3;
    
    public String calculateSomething() throws Exception {
        String r = "QUALQUER COISA";

        try {
            logger.info("Trying to retrieve the data from dao.");
        } catch (Exception ex){
            logger.info("Could not retrieve the data.");
        }

        return r;
    }
}
