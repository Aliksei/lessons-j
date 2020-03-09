package com.capsilon.javacources.message;

public class MessageLogger {

    private final String name;

    public MessageLogger(String name) {
        this.name = name;
    }

    public void logMessage(final String message) {
        System.out.println(String.format("[%s] LOGGING Message : [%s]", name, message));
    }

}
