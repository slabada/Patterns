package org.patterns.structural.adapter;

public class SocketAdapter implements EuroSocket {

    private final UsaSocket euroSocket;

    public SocketAdapter(UsaSocket euroSocket) {
        this.euroSocket = euroSocket;
    }

    @Override
    public void getPower() {
        euroSocket.getPower();
    }
}
