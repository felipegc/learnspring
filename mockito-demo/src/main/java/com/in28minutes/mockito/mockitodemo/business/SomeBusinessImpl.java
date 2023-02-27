package com.in28minutes.mockito.mockitodemo.business;

import java.util.Optional;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        if (data == null || data.length == 0) return 0;
        int greatestValue = Integer.MIN_VALUE;
        for(int value: data) {
            if (value > greatestValue) {
                greatestValue = value;
            }
        }
        return greatestValue;
    }
}

interface DataService {
    int[] retrieveAllData();
}
