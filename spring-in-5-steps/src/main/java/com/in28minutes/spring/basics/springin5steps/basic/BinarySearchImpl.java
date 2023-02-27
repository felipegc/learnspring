package com.in28minutes.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
// Component is for generic componenets while the Service intends to be for business logic.
//@Component
// singleton is the default one.
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
    Logger LOGGER =
            LoggerFactory.getLogger(BinarySearchImpl.class);

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(){}

//    You can inject by Set methods = whithout set is also considered setter injection which is the default.
//    @Autowired
//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }


    // You can inject by constructor
//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }
    public int binarySearch(int[] numbers, int numberToSearchFor){
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        // Search the array
        return 3;
    }

    @PostConstruct
    public void postConstruct() {
        LOGGER.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.info("pre destroy");
    }
}
