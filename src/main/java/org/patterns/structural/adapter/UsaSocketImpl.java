package org.patterns.structural.adapter;

public class UsaSocketImpl implements UsaSocket {
    @Override
    public void getPower() {
        System.out.println("110 volt");
    }
}
