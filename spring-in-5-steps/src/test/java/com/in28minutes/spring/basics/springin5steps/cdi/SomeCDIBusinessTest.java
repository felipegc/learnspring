package com.in28minutes.spring.basics.springin5steps.cdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(SpringRunner.class)
//@ExtendWith(SpringExtension.class)
//@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class)
//@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
class SomeCDIBusinessTest {

    // Get this bean from the context
    // Inject Mock
    @InjectMocks
    SomeCDIBusiness someCDIBusiness;

    // Create Mock
    @Mock
    SomeCDIDAO daoMock;

    @Test
    void testBasicScenario() {
        // when(daoMock.getData()) method is called return int []{2,4}
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});

        int result = someCDIBusiness.findGreatest();
        assertEquals(4, result);
    }

    @Test
    void testBasicScenario2() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {});

        int result = someCDIBusiness.findGreatest();
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    void testBasicScenario3() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2,2});

        int result = someCDIBusiness.findGreatest();
        assertEquals(2, result);
    }
}