package com.capsilon.javacources.config;

import com.capsilon.javacources.message.MessageLogger;
import com.capsilon.javacources.message.MessageQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class StorageConfiguration {

    @Bean
    public MessageQueue storage(@Autowired MessageLogger messageLogger) {
        return new MessageQueue(messageLogger);
    }

}
