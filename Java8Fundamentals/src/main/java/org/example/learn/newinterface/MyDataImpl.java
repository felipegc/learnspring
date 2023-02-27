package org.example.learn.newinterface;

public class MyDataImpl implements MyData {

    public boolean isNull(String str) { // this is not overriding the interface method.
        System.out.println("Impl Null Check");

        return str == null ? true : false;
    }
}
