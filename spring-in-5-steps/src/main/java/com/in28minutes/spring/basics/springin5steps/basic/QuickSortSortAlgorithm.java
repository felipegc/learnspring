package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
@Qualifier("quick")
public class QuickSortSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers) {
        // Sort the array with quick sort logic
        return numbers;
    }
}
