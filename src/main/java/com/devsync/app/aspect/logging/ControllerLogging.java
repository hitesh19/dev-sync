package com.devsync.app.aspect.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by ADITYA on 03-09-2017.
 */
@Component
@Aspect
public class ControllerLogging {
    private Logger logger = LoggerFactory.getLogger(ControllerLogging.class);

    @Pointcut("execution(* com.devsync.app.controller..*(..))")
    private void log(){}

    @Before("log()")
    public void logBefore(JoinPoint jp) {

        Object[] signatureArgs = jp.getArgs();
        StringBuilder params = new StringBuilder();

        for (Object signatureArg: signatureArgs) {
            params.append(signatureArg.toString());
            params.append(" ");
        }

        logger.info("Request for method: " + jp.getSignature().getName() + "() - params: " + params.toString());
    }

    @After("log()")
    public void logAfter(JoinPoint jp) {

        Object[] signatureArgs = jp.getArgs();
        StringBuilder params = new StringBuilder();

        for (Object signatureArg: signatureArgs) {
            params.append(signatureArg.toString());
            params.append(" ");
        }

        logger.info("Request completed for method: " + jp.getSignature().getName() + "() - params: " + params.toString());

    }
}
