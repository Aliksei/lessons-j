package com.capsilon.javacources.message;


public class MessageSender {

    private MessageLogger messageLogger;
    private MessageQueue messageQueue;

    public MessageSender(MessageLogger messageLogger, MessageQueue messageQueue) {
        this.messageLogger = messageLogger;
        this.messageQueue = messageQueue;
    }

    public void sendMessage(final String message) {
        messageLogger.logMessage("Sending Message :" + message);
        messageQueue.put(message);
    }

}
