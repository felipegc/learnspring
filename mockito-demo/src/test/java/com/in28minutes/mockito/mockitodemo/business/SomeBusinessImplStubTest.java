package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void findTheGreatestFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15, 5});
        assertEquals(25, businessImpl.findTheGreatestFromAllData());


//        DataService dataServiceMock = mock(DataService.class);
//        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15, 5});
//        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
//        int result = businessImpl.findTheGreatestFromAllData();
//        assertEquals(25, result);
    }

    @Test
    void findTheGreatestWithOneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{15});
        assertEquals(15, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestWithZeroValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(0, businessImpl.findTheGreatestFromAllData());
    }
}
