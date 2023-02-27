package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {

    @Test
    void findTheGreatestFromAllData() {
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }

    @Test
    void findTheGreatestWithOneValue() {
        DataServiceStub2 dataServiceStub = new DataServiceStub2();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(15, result);
    }
}

class DataServiceStub implements DataService {
    public int[] retrieveAllData() {
        return new int[]{25,15,5};
    }
}

class DataServiceStub2 implements DataService {
    public int[] retrieveAllData() {
        return new int[]{15};
    }
}