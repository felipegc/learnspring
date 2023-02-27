package org.example.learn.newinterface;

public class MyClassInt implements Interface1, Interface2 {

    public void method1(String str) {}

    public void method2(String str) {}

    @Override
    public void log(String str) {
        System.out.println("My Class logging::"+str);
        Interface1.print("abc");
    }
}
