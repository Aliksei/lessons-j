package com.capsilon.javacources.config;


import com.capsilon.javacources.message.MessageLogger;
import com.capsilon.javacources.message.MessageQueue;
import com.capsilon.javacources.message.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;


@Import(StorageConfiguration.class)
public class ApplicationConfiguration {

    @Bean
    public MessageLogger messagePrinter() {
        return new MessageLogger("CONSOLE");
    }

    @Bean
    public MessageSender messageSender(@Autowired MessageLogger messageLogger, @Autowired MessageQueue messageQueue) {
        return new MessageSender(messageLogger, messageQueue);
    }


}
