package com.capsilon.javacources.message;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueue {

    private Queue<String> queue;
    private MessageLogger messageLogger;

    public MessageQueue(MessageLogger messageLogger) {
        this.queue = new LinkedList<>();
        this.messageLogger = messageLogger;
    }

    public void put(final String value) {
        messageLogger.logMessage("Adding message to queue " + value);
        queue.add(value);
    }

    public String pollLast() {
        messageLogger.logMessage("Polling message from queue");
        return queue.poll();
    }

}
