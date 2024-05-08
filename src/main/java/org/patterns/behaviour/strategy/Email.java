package org.patterns.behaviour.strategy;

public class Email implements Notification{
    @Override
    public void send() {
        System.out.println("Send Email");
    }
}
