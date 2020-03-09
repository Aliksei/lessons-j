package com.capsilon.javacources.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MessageLogger {

    private String name;

    public MessageLogger() {}

    public MessageLogger(String name) {
        this.name = name;
    }

    public void logMessage(final String message) {
        System.out.println(String.format("[%s] LOGGING Message : [%s]", name, message));
    }

    @PostConstruct
    public void setName() {
        if (name == null) {
            this.name = "C O N S O L E";
        }
    }

}
