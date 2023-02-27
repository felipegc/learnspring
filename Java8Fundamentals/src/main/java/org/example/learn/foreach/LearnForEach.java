package org.example.learn.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class LearnForEach {
    List<Integer> myList = new ArrayList<Integer>();

    public LearnForEach(){
        for(int i=0; i<10; i++) myList.add(i);
    }

    public void TraversingForEach() {
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator value::"+i);
        }

        myList.forEach(new Consumer<Integer>(){
            public void accept(Integer t){
                System.out.println("forEach anonymous class Value::"+t);
            }
        });

        MyConsumer action = new MyConsumer();
        myList.forEach(action);
    }
}

class MyConsumer implements Consumer<Integer> {
    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }
}
