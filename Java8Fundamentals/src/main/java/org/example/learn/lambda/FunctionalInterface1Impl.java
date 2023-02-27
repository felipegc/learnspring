package org.example.learn.lambda;

public class FunctionalInterface1Impl implements FunctionalInterface1{
    public String m(Iterable<String> it) {
        return it.iterator().next();
    }
}
