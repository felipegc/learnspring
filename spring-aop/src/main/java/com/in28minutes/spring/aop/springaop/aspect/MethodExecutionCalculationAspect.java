package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
    private Logger logger = LoggerFactory.getLogger(MethodExecutionCalculationAspect.class);

//    @Around(value="com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    // Using annotations in combination with joinpoint
    @Around("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
    public String afterReturning(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time taken by {} is {}", joinPoint, timeTaken);
        // startTime = x
        // allow execution of method
        // endTime = y
        return (String) proceed;
    }
}
