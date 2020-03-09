package com.capsilon.javacources;

import com.capsilon.javacources.config.ApplicationConfiguration;
import com.capsilon.javacources.message.MessageQueue;
import com.capsilon.javacources.message.MessageSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplciaiton {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        MessageSender sender = applicationContext.getBean(MessageSender.class);
        MessageQueue queue = applicationContext.getBean(MessageQueue.class);

        sender.sendMessage("Hello world");
        sender.sendMessage("Hello world Second");

        System.out.println(queue.pollLast());
        System.out.println(queue.pollLast());
    }


}
