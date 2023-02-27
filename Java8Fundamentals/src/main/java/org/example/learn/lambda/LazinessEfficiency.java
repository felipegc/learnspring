package org.example.learn.lambda;

import java.util.Comparator;
import java.util.List;

public class LazinessEfficiency {

    public static int findSquareOfMaxOddTraditionalWay(List<Integer> numbers) {
        int max = 0;
        for (int i : numbers) {
            if (i%2 != 0 && i > 3 && i < 11 && i > max) {
                max = i;
            }
        }
        return max * max;
    }

    public static int findSquareOfMaxOdd(List<Integer> numbers) {
        int max = 0;
        return numbers.stream()
//                .filter(LazinessEfficiency::isOdd)
                .filter(i -> i % 2 != 0)
                .filter(LazinessEfficiency::isGreaterThan3)
                .filter(LazinessEfficiency::isLessThan11)
                .max(Comparator.naturalOrder())
                .map(i -> i * i)
                .get();
    }

    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static boolean isGreaterThan3(int i) {
        return i > 3;
    }

    public static boolean isLessThan11(int i) {
        return i < 11;
    }
}
