package org.patterns.behaviour.strategy;

public class Context {

    private final Notification notification;

    public Context(Notification notification) {
        this.notification = notification;
    }

    public void getNotification() {
        notification.send();
    }
}
