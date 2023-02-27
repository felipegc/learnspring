package org.example.learn.lambda;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class CalculatePrime {
    public static boolean isPrimeTraditionalWay(int number) {
        if(number < 2) return false;
        for(int i=2; i<number; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeDeclarativeApproach(int number) {
        // look that noneMatch expects a functional interface, which is predicate.
//        IntPredicate isDivisible = index -> number % index == 0;
//        return number > 1 && IntStream.range(2, number).noneMatch(isDivisible);

        // but we can implement right away.
        return number > 1 && IntStream.range(2, number).noneMatch(
                index -> number % index == 0);
    }
}
