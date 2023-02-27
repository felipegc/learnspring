package org.example.learn.generics;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    @Override
    public void makeNoise() {
        System.out.println("AuAu!");
    }
}
