package org.example.learn.newinterface;

public interface Interface2 {
    void method2(String str);

    default void log(String str) {
        System.out.println("I2 logging::"+str);
    }
}