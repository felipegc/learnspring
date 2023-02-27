package org.example.learn.lambda;

import java.util.List;
import java.util.function.Predicate;

public class BehaviouredMethod {

    // We can dynamically pass different predicates which changes the behavior of this sum.
    public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.parallelStream()
                .filter(predicate)
                .mapToInt(i -> i)
                .sum();
    }
}
