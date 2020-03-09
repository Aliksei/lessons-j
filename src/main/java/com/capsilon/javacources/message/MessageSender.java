package com.capsilon.javacources.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

    @Autowired
    private MessageLogger messageLogger;
    @Autowired
    private MessageQueue messageQueue;

    public void sendMessage(final String message) {
        messageLogger.logMessage("Sending Message :" + message);
        messageQueue.put(message);
    }

}
