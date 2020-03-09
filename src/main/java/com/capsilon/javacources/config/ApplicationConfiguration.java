package com.capsilon.javacources.config;


import com.capsilon.javacources.message.MessageLogger;
import com.capsilon.javacources.message.MessageSender;
import org.springframework.context.annotation.Bean;

public class ApplicationConfiguration {

    @Bean
    public MessageLogger messagePrinter() {
        return new MessageLogger("CONSOLE");
    }

    @Bean
    public MessageSender messageSender(MessageLogger messageLogger) {
        return new MessageSender(messageLogger);
    }


}
