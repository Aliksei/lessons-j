package com.capsilon.javacources;

import com.capsilon.javacources.config.ApplicationConfiguration;
import com.capsilon.javacources.message.MessageSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplciaiton {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        MessageSender messageSender = applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage("Hello world");
    }


}
