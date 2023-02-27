package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration
@Aspect
@Configuration
public class UserAccessAspect {
    private Logger logger = LoggerFactory.getLogger(UserAccessAspect.class);

    // what kind of method call I would intercept
    // The format: any return type in a specific package, any class, any method call with the respective arguments
    // execution(* PACKAGE.*.*(..))
    // Weaving and Weaver: Weaving is the implemenation of all this things while Weaver is the framework for calling this implementation.

    // The execution defines what kind of methods to be intercepted
    // join point is the statement for that specific interception
    // The combination of both of them is called aspect

    //@Before("execution(* com.in28minutes.spring.aop.springaop.data.*.*(..))")
    // As a best practice we can use the qualified name of a class definition for point cuts. This gives a better maintainability
    @Before("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")

    public void before(JoinPoint joinPoint) {
        // What to do
        // Advice
        // Aspect is the combination: what kind of methods to intercept + what to do
        // join point is the specific interception of method call. Specific execution
        logger.info("Check for user access {}", joinPoint);
        logger.info("Allowed execution for {}", joinPoint);
    }
}
