package com.capsilon.javacources.message;


public class MessageSender {

    private MessageLogger messageLogger;

    public MessageSender(MessageLogger messageLogger) {
        this.messageLogger = messageLogger;
    }

    public void sendMessage(final String message) {
        messageLogger.logMessage(message);
        System.out.println("Sending Message : " + message);
    }

}
