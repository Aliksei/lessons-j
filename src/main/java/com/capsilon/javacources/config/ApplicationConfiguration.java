package com.capsilon.javacources.config;


import com.capsilon.javacources.message.MessageLogger;
import org.springframework.context.annotation.Bean;

public class ApplicationConfiguration {

    @Bean
    public MessageLogger messagePrinter() {
        return new MessageLogger("CONSOLE");
    }


}
