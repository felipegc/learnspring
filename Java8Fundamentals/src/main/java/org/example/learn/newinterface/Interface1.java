package org.example.learn.newinterface;

public interface Interface1 {
    void method1(String str);

    static void print(String str) {
        System.out.println("Chamando print de interface1");
    }

    default void log(String str) {
        System.out.println("I1 logging::"+str);
    }
}