package org.patterns.structural.adapter;

public class EuroSocketImpl implements EuroSocket {
    @Override
    public void getPower() {
        System.out.println("220 volt");
    }
}
