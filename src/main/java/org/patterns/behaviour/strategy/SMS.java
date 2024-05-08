package org.patterns.behaviour.strategy;

public class SMS implements Notification{
    @Override
    public void send() {
        System.out.println("Send SMS");
    }
}
