package org.patterns.structural.bridge;

public class BMW implements Model {
    @Override
    public void move(String str) {
        System.out.println(str + " BMW move");
    }
}
