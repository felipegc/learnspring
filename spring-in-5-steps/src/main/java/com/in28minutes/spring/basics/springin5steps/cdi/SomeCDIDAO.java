package com.in28minutes.spring.basics.springin5steps.cdi;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class SomeCDIDAO {
    public int[] getData() {
        return new int[]{5, 89, 100};
    }
}
