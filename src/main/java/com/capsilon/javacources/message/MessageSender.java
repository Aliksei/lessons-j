package com.capsilon.javacources.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

    private MessageLogger messageLogger;
    private MessageQueue messageQueue;

    public MessageSender(@Autowired MessageLogger messageLogger, @Autowired MessageQueue messageQueue) {
        this.messageLogger = messageLogger;
        this.messageQueue = messageQueue;
    }

    public void sendMessage(final String message) {
        messageLogger.logMessage("Sending Message :" + message);
        messageQueue.put(message);
    }

}
