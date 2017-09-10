package com.devsync.app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by ADITYA on 03-09-2017.
 */
@Aspect
@Component
public class ControllerLogging {
    private long start;

    ControllerLogging() {
        start = System.currentTimeMillis();
    }

    @Pointcut("execution(* com.devsync.app.controller..*(..))")
    private void allControllerMethods(){}

    @Before("allControllerMethods()")
    public void logBeforeControllerMethods(JoinPoint jp) {

        String className = jp.getSignature().getDeclaringTypeName();
        Logger logger = LoggerFactory.getLogger(className);

        String methodName = jp.getSignature().getName();

        logger.info("Received " + methodName + "() request for " + Arrays.toString(jp.getArgs()));
    }

    @After("allControllerMethods()")
    public void logAfterControllerMethods(JoinPoint jp) {

        String className = jp.getSignature().getDeclaringTypeName();
        Logger logger = LoggerFactory.getLogger(className);

        String methodName = jp.getSignature().getName();

        long elapsedTime = System.currentTimeMillis() - start;
        logger.info("Finished " + methodName + "() request for " + Arrays.toString(jp.getArgs()) + " execution time: " + elapsedTime + " ms");
    }
}
