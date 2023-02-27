package com.in28minutes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MyMathTest {

    private MyMath math = new MyMath();

    @Test
    void test() {
        int[] numbers = {1,2,3};
        int result = math.calculateSum(numbers);
        int expectedResult = 6;
        assertEquals(expectedResult, result);
    }

    @Test
    void calculateSumWhenNumbersEmpty() {
        assertEquals(0, math.calculateSum(new int[]{}));
    }

    @Test
    void calculateSumWhenNumbersNull() {
        int result = math.calculateSum(null);
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }
}
