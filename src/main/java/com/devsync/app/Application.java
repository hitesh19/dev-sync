package com.devsync.app;

import com.devsync.app.controllers.Dummy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point.
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Hello ;)");

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("file:spring-configuration/configuration.xml");

        System.out.println(applicationContext.getApplicationName());
        Dummy a = (Dummy) applicationContext.getBean("dummy");
        System.out.println(a.toString());
    }
}
