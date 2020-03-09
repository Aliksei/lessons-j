package com.capsilon.javacources.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

@Component
public class MessageQueue {

    private Queue<String> queue = new LinkedList<>();

    @Autowired
    private MessageLogger messageLogger;

    public void put(final String value) {
        messageLogger.logMessage("Adding message to queue " + value);
        queue.add(value);
    }

    public String pollLast() {
        messageLogger.logMessage("Polling message from queue");
        return queue.poll();
    }

}
