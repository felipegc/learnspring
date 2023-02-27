package com.in28minutes.spring.basics.springin5steps.basic;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
class BinarySearchImplTest {

    // Get this bean from the context
    @Autowired
    BinarySearchImpl binarySearchImpl;

    @Test
    void binarySearch() {
        // call method on binarySearch
        // check if the value is correct
        int result = binarySearchImpl.binarySearch(new int[]{}, 5);
        assertEquals(3, result);
    }
}