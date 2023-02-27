package com.in28minutes.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao3 {

    public String retrieveSomething() throws Exception {
        throw new Exception("DEU RUIM");
    }
}
