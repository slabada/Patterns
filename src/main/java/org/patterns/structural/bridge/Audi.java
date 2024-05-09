package org.patterns.structural.bridge;

public class Audi implements Model {
    @Override
    public void move(String str) {
        System.out.println(str + " Audi move");
    }
}
