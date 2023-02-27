package org.example.learn.generics;

import java.util.List;
import java.util.stream.Stream;

public class StaticMethod {
    public static <T extends Animal> void shout(T thingToShout){
        System.out.println(thingToShout + "!!!");
    }

    public static void printList(List<? extends Animal> myList) {
        myList.stream().forEach(a -> a.makeNoise());
    }

}
