package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    void ListReturnOneValue() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(3, listMock.size());
    }

    @Test
    void ListReturnMultipleTimes() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());
    }

    @Test
    void specificParameters() {
        List listMock = mock(List.class);
//        when(listMock.get(0)).thenReturn("SomeStringBack");
//        assertEquals("SomeStringBack", listMock.get(0));
//        assertEquals(null, listMock.get(1));

        when(listMock.get(Mockito.anyInt())).thenReturn("SomeStringBack");
        assertEquals("SomeStringBack", listMock.get(0));
        assertEquals("SomeStringBack", listMock.get(1));
    }
}
