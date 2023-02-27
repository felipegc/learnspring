package com.in28minutes.spring.basics.springin5steps.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {
    @Inject
    SomeCDIDAO someCdiDao;

    public SomeCDIDAO getSomeCdiDao() {
        return someCdiDao;
    }

    public void setSomeCdiDao(SomeCDIDAO someCdiDao) {
        this.someCdiDao = someCdiDao;
    }

    public int findGreatest() {
        int[] data = someCdiDao.getData();
        int greatest = Integer.MIN_VALUE;
        for (int value:data) {
            if(value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
}
