package com.in28minutes;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyMath {

    public int calculateSum(int[] numbers) {
        return numbers == null ? 0 : IntStream.of(numbers).sum();
//        return Arrays.stream(numbers).reduce((sub, el) -> sub + el).orElse(0);
//        return reduce.isEmpty() ? 0 : reduce.getAsInt();
//        int sum = 0;
//        for (int n : numbers) {
//            sum +=n;
//        }
//        return sum;
    }
}
