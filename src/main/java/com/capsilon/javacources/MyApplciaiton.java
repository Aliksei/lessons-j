package com.capsilon.javacources;

import com.capsilon.javacources.config.ApplicationConfiguration;
import com.capsilon.javacources.message.MessageLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplciaiton {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        MessageLogger messageSender = applicationContext.getBean(MessageLogger.class);
        messageSender.logMessage("Hello world");
    }


}
